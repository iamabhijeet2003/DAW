const mongoose = require("mongoose");
const Peli = require("./pelis.js");
mongoose.connect('mongodb://127.0.0.1:27017/cinema');

Peli.findByIdAndDelete('65c5303950c519d0a86a7aae').then(result => {
    console.log(result.deletedCount, "Pelis deleted");
    }).catch (error => {
    console.log("ERROR:", error);
});

