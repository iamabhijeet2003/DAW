const mongoose = require("mongoose");
const Peli = require("./pelis.js");
mongoose.connect('mongodb://127.0.0.1:27017/cinema');
Peli.find().then(result => {
    console.log(JSON.parse(JSON.stringify(result)));
}).catch(error => {
    console.log("Error llegint MongoDB");
});
