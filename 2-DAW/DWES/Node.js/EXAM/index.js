const express = require('express');
const mongoose = require('mongoose');
const { Author, Book } = require('./author');
const app = express();
const PORT = 3000;


mongoose.connect('mongodb://localhost:27017/examen')

app.use(express.json());

// exercisi 2 - create a GET service to return all the books and their books
app.get('/authors',  (req, res) => {
    Author.find().then(result => {
        res.status(200)
        .send({ok:true,result:result});
    }).catch(error => {
        res.status(400)
        console.log({ok:false,error: "Error llegint MongoDB"});
    });
});

// exercisi 2 - Create a GET service that returns the Author with a given id passed in the query string
app.get('/authors/:id', (req, res) => {
    let idAutor = req.params.id ;
    Author.findById(idAutor).then(result => {
        if(result!=null){
            res.status(200)
            .send({ok:true,result:result});
        }else{
            res.status(204)
            .send({ok:false,result: "Id no existe"});
        }
        
    }).catch(error => {
        res.status(400)
        console.log({ok:false,error: "Error en mongo"});
    });
});

//  exercisi 3  - Create a POST service to add a new Author with a couple of books to the collection.

app.post('/newauthor', (req, res) => {
    let name = req.body.name;
    let country = req.body.country;
    let books = req.body.books;
    let author1 = new Author({
        "name":name,
        "country":country,
        "books":books,
    });
    author1.save().then(result => {
        res.status(201)
        .send({ok:true,result:result});

    }).catch(error => {
        res.status(500)
        .send({ok:false,error:"Cant insert"});
    })
});

// exercisi 3 -  Create a PUT service to add a new Book to an existing Author given the id
app.put('/author/addbook/:id', (req, res) => {
    let idAutor = req.params.id ;
    let newbooks = req.body.books;
    Author.findByIdAndUpdate(idAutor,{
        $push:{
            books: newbooks,
        },
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true, resultado: resultado});
    }).catch( error =>{
        res.status(400)
        .send({ok: false, error: 'No se ha podido actualizar la película'})
    })
})

//  exercisi 4 - Create a PUT service to modify the country of an author given the id.
app.put('/author/addcountry/:id', (req, res) => {
    let idAutor = req.params.id ;
   
    let newcountry = req.body.country; 
    Author.findByIdAndUpdate(idAutor,{
        $set:{
            country: newcountry,
        },
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true, resultado: resultado});
    }).catch( error =>{
        res.status(400)
        .send({ok: false, error: 'No se ha podido actualizar el pais'})
    })
})

// exercisi4 - Create a PUT service to modify the name of an author given the id.
app.put('/author/addname/:id', (req, res) => {
    let idAutor = req.params.id ;
    let newname = req.body.name;  
    Author.findByIdAndUpdate(idAutor,{
        $set:{
            name: newname,
        },
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true, resultado: resultado});
    }).catch( error =>{
        res.status(400)
        .send({ok: false, error: 'No se ha podido actualizar el pais'})
    })
})

// exercisi 4 - Create a PUT service to change the description a book given the id.
app.put('/books/:id/description', (req, res) => {
    const bookId = req.params.id;
    const newDescription = req.body.description;

    if (!newDescription) {
        return res.status(400).json({ ok: false, error: 'New description is missing' });
    }
    Author.findOneAndUpdate(
        { 'books._id': bookId }, 
        { $set: { 'books.$.description': newDescription } }, 
        { new: true }
    )
    .then(updatedAuthor => {
        if (!updatedAuthor) {
            return res.status(404).json({ ok: false, error: 'Book not found' });
        }
        res.status(200).json({ ok: true, result: updatedAuthor });
    })
    .catch(error => {
        res.status(500).json({ ok: false, error: 'Error updating book description', details: error.message });
    });
});

// exercisi 5  - Create a DELETE service to delete an author given the id
app.delete('/author/delete/:id', (req, res) => {
    let idAutor = req.params.id;
    Author.findByIdAndDelete(idAutor).then(result => {
        res.status(200)
        .send({ok:true,message:"deleted"});
        }).catch (error => {
            res.status(500)
            .send({ok:false,error:"Cant delete"});
    });    
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
