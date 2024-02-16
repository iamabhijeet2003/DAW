const mongoose = require('mongoose');


const bookSchema = new mongoose.Schema({
    title: { type: String},
    year: { type: String, minlength: 4, maxlength: 4 },
    description: { type: String },
    pages: { type: Number }
});



const authorSchema = new mongoose.Schema({
    name: { type: String},
    country: { type: String},
    books: [{ type: bookSchema }]
});


const Author = mongoose.model('Author', authorSchema);
const Book = mongoose.model('Book', bookSchema);

//module.exports = Author;
module.exports = { Author, Book };