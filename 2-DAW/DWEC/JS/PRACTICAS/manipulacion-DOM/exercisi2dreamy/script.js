window.onload = function() {
    cambiarTexto();
    //cambiarColor("red");
    borrarDiv();
}

//Canvia dinàmicament el text del menú principal i els menús secundaris.
function cambiarTexto(){
  var menuPrincipal = document.querySelectorAll("#menu ul li a");
  var menusSecundarios = document.querySelectorAll("#sidebar ul li a");

  for(var i = 0; i<menuPrincipal.length; i++){
      menuPrincipal[i].innerHTML = "Nuevo enlace " + (i+1);

  }

  for (var i = 0; i < menusSecundarios.length; i++) {
      menusSecundarios[i].innerHTML = "Nuevo Link Secundario " + (i + 1);
    }
}

//Canvia el color de la lletra dels menús dinàmicament.
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

//Borra el contenido del <div> que tiene por id="content" y 
//haz que aparezcan tres párrafos predefinidos por ti.

function borrarDiv() {
    var divContent = document.getElementById("content");
    divContent.innerHTML = "";
    for (var i = 1; i <= 3; i++) {
      var nuevoParrafo = document.createElement("p");
      nuevoParrafo.textContent = "Parrafo numero " + i + " definido por abhi";
      divContent.appendChild(nuevoParrafo);
    }
  }
  