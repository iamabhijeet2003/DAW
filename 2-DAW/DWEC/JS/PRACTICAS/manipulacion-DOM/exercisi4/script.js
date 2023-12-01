window.onload = function() {
    borrarDiv();
}

var imagenes = [
    "images/imagenes_aleatoria/1.jpg",
    "images/imagenes_aleatoria/2.jpg",
    "images/imagenes_aleatoria/3.jpg",
    "images/imagenes_aleatoria/4.jpg",
    "images/imagenes_aleatoria/5.jpg",
    "images/imagenes_aleatoria/6jpg",
    "images/imagenes_aleatoria/7.jpg",
    "images/imagenes_aleatoria/8.jpg",
    "images/imagenes_aleatoria/9.jpg",
    "images/imagenes_aleatoria/10.jpg"
]

function borrarDiv(){
    
    var divContent = document.getElementById("content");
    divContent.innerHTML = "";

    var crearElementImagen = document.createElement("img");
    var randomIndex = Math.floor(Math.random() * imagenes.length);
    var randomImageUrl = imagenes[randomIndex];
    crearElementImagen.src = randomImageUrl;
    crearElementImagen.width = 300;
    divContent.appendChild(crearElementImagen);

}