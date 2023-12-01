window.onload = function() {
    cambiarTexto();
    cambiarColor("red");
    borrarDiv();
}


function cambiarTexto(){
    var menuPrincipal = document.querySelectorAll("#menu ul li a");
    var menusSecundarios = document.querySelectorAll("#sidebar ul li a");

    for(var i = 0; i<menuPrincipal.length; i++){
        menuPrincipal[i].textContent = "Nuevo enlace " + (i+1);

    }

    for (var i = 0; i < menusSecundarios.length; i++) {
        menusSecundarios[i].textContent = "Nuevo Link Secundario " + (i + 1);
      }
}


function cambiarColor(colorACambiar){
    var menuPrincipalText = document.querySelectorAll("#menu ul li a");
    var menusSecundariosText = document.querySelectorAll("#sidebar ul li a");

    
    for(var i = 0; i<menuPrincipalText.length; i++){
        menuPrincipalText[i].style.color = colorACambiar;

    }

    for (var i = 0; i < menusSecundariosText.length; i++) {
        menusSecundariosText[i].style.color = colorACambiar;
      }

}



function borrarDiv(){
    var divContent = document.getElementById("content");
    while(divContent.firstChild){
        divContent.removeChild(divContent.firstChild);
    }

    for(var i = 1; i <=3; i++){
        var nuevoParrafo = document.createElement("p");
        nuevoParrafo.textContent = "Parrafo numero " + i + " definido por abhi";;
        divContent.appendChild(nuevoParrafo);
    }
}