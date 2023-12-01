window.onload = function() {
    borrarDivyCrearTabla();
}

var paisesCapitales = [
    "Espanya, Madrid",
    "Francia, Paris",
    "Portugal, Lisboa",
    "Alemania, Berlin",
    "Belgica, Bruselas"
];


function borrarDivyCrearTabla(){
    var divContent = document.getElementById("content");
    while(divContent.firstChild){
        divContent.removeChild(divContent.firstChild);
    }

    var tabla = document.createElement("table");
    var headerDeTabla = tabla.createTHead();
    var filaDeHeader = headerDeTabla.insertRow();

    var thPais = document.createElement("th");
    var thCapital = document.createElement("th");
    thPais.textContent="Pais";
    thCapital.textContent="Capital";

    filaDeHeader.appendChild(thPais);
    filaDeHeader.appendChild(thCapital);

    for(var i = 0; i<paisesCapitales.length; i++){
        var datos = paisesCapitales[i].split(",");
        var fila = tabla.insertRow();
        var celdaPais = fila.insertCell(0);
        var celdaCapital = fila.insertCell(1);
        celdaPais.textContent = datos[0];
        celdaCapital.textContent = datos[1];
    }

    divContent.appendChild(tabla);
}