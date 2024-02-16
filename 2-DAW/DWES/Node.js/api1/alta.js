const mongoose = require("mongoose");
const Peli = require("./pelis.js");
mongoose.connect('mongodb://127.0.0.1:27017/cinema');
let peli1 = new Peli({
    "Title":"El Padrino",
    "Year":"1972",
});

peli1.Director = []
peli1.Director.push({"Name":"Coppola","Year":"1915","Country":"USA"})
peli1.Director.push({"Name":"El fill de Coppola","Year":"1945","Country":"USA"})

peli1.save().then(result => {
    console.log("Peli added:", result);
    }).catch(error => {
    console.log("ERROR adding peli:", error);
    });
