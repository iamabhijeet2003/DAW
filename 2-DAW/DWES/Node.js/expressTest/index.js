const express = require("express");
const app = express();
const port = 8080;
const mongoose = require("mongoose");
const Peli = require("./pelis.js");
const bodyParser = require('body-parser');
mongoose.connect('mongodb://127.0.0.1:27017/cinema');
app.use(express.json());
app.use(bodyParser.json());
app.get('/welcome', (req, res) => {
        Peli.find().then(result => {
            res.status(200)
            .send({ok:true,result:result});
        }).catch(error => {
            res.status(400)
            console.log({ok:false,error: "Error llegint MongoDB"});
        });

});

app.get('/welcome/:id', (req, res) => {
    let idPelicula = req.params.id ;
    Peli.findById(idPelicula).then(result => {
        if(result){
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
})



app.post('/welcome', (req, res) => {
    let title = req.body.Title;
    let year = req.body.Year;
    let director = req.body.Director;
    let peli1 = new Peli({
        "Title":title,
        "Year":year,
        "director":director
    });
    peli1.save().then(result => {
        //console.log("Guardado con exito");
        res.status(201)
        .send({ok:true,result:result});

    }).catch(error => {
        res.status(500)
        .send({ok:false,error:"Cant insert"});
    })
});

app.put('/welcome/title/:id', (req, res) => {
    let idPelicula = req.params.id;
    let newTitle = req.body.Title;
    let newYear = req.body.Year;
    Peli.findByIdAndUpdate(idPelicula,{
        $set:{
            Title: newTitle
        },
        }, {new: true}).then(resultado =>{
            res.status(200)
            .send({ok:true,resultado:resultado});
        }).catch( error =>{
            res.status(400)
            .send({ok: false, error: 'No se ha podido actualizar la película'})
        })

})

app.put('/welcome/year/:id', (req, res) => {
    let idPelicula = req.params.id;
    let newTitle = req.body.Title;
    let newYear = req.body.Year;
    Peli.findByIdAndUpdate(idPelicula,{
        $set:{
            Year: newYear
        },
        }, {new: true}).then(resultado =>{
            res.status(200)
            .send({ok:true,resultado:resultado});
        }).catch( error =>{
            res.status(400)
            .send({ok: false, error: 'No se ha podido actualizar la película'})
        })

})

app.put('/welcome/director/:id', (req, res) => {
    let idPelicula = req.params.id;
    let newDirector = req.body.Director;
    Peli.findByIdAndUpdate(idPelicula,{
        $set:{
            Director: newDirector
        },
        }, {new: true}).then(resultado =>{
            res.status(200)
            .send({ok:true,resultado:resultado});
        }).catch( error =>{
            res.status(400)
            .send({ok: false, error: 'No se ha podido actualizar la película'})
        })

})

app.put('/welcome/adddirector/:id', (req, res) => {
    let idPelicula = req.params.id;
    let newDirector = req.body.Director;
    Peli.findByIdAndUpdate(idPelicula,{
        $push:{
            Director: newDirector,
        },
    }, {new: true}).then(resultado =>{
        res.status(200)
        .send({ok:true, resultado: resultado});
    }).catch( error =>{
        res.status(400)
        .send({ok: false, error: 'No se ha podido actualizar la película'})
    })
})

app.delete('/welcome/:id', (req, res) => {
    let idPelicula = req.params.id;
    Peli.findByIdAndDelete(idPelicula).then(result => {
        res.status(200)
        .send({ok:true,message:"deleted"});
        }).catch (error => {
            res.status(500)
            .send({ok:false,error:"Cant delete"});
    });    
});

app.listen(port, () => {
    console.log(`Server is listening at http://localhost:${port}`);
});
