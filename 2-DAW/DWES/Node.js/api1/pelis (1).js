const mongoose = require("mongoose");

let directorSchema = new mongoose.Schema({
    Name: String,
    Birthday: String,
    Year: String,
    Country: String
})

let pelisSchema = new mongoose.Schema({
    Title: String,
    Year: String,
    Director: [directorSchema]
});
let Peli = mongoose.model('movies',pelisSchema);
module.exports = Peli;