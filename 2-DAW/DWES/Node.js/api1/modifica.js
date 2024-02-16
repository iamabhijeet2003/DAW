const mongoose = require("mongoose");
const Peli = require("./pelis.js");
mongoose.connect('mongodb://127.0.0.1:27017/cinema');

Peli.updateOne({Title: 'Solo. A Star Wars Story'},
{$set: {Year:'2007'}}, {new:true})
.then(result => {
console.log("Modified peli:", result);
}).catch (error => {
console.log("ERROR:", error);
});