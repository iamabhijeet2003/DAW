const colleccioAlumnes ={
    "alumnes": [
      {
        "nom": "Pere",
        "cognoms": "Martínez Soler",
        "dni": "12345678A",
        "data_naixement": "1998-03-15",
        "sexe": "Home",
        "nota_mitja": 8.5
      },
      {
        "nom": "Marta",
        "cognoms": "Gimeno Ramon",
        "dni": "98765432B",
        "data_naixement": "1999-07-22",
        "sexe": "Dona",
        "nota_mitja": 7.2
      },
      {
        "nom": "Jordi",
        "cognoms": "Fuster Vidal",
        "dni": "56789012C",
        "data_naixement": "2000-05-10",
        "sexe": "Home",
        "nota_mitja": 6.8
      },
      {
        "nom": "Anna",
        "cognoms": "Llopis Ferrer",
        "dni": "34567890D",
        "data_naixement": "1997-11-28",
        "sexe": "Dona",
        "nota_mitja": 9.0
      },
      {
        "nom": "Enric",
        "cognoms": "Serra Moreno",
        "dni": "13579246E",
        "data_naixement": "1998-09-05",
        "sexe": "Home",
        "nota_mitja": 7.5
      },
      {
        "nom": "Clara",
        "cognoms": "Vidal Roig",
        "dni": "24680135F",
        "data_naixement": "1999-02-18",
        "sexe": "Dona",
        "nota_mitja": 8.2
      },
      {
        "nom": "Marc",
        "cognoms": "Moll Navarro",
        "dni": "98765432G",
        "data_naixement": "2000-07-01",
        "sexe": "Home",
        "nota_mitja": 6.5
      },
      {
        "nom": "Elena",
        "cognoms": "Ferrer Gil",
        "dni": "12345678H",
        "data_naixement": "1997-04-12",
        "sexe": "Dona",
        "nota_mitja": 9.5
      },
      {
        "nom": "Lluís",
        "cognoms": "Soler Roselló",
        "dni": "87654321I",
        "data_naixement": "1998-08-24",
        "sexe": "Home",
        "nota_mitja": 7.8
      },
      {
        "nom": "Silvia",
        "cognoms": "Fuster Tormo",
        "dni": "56789012J",
        "data_naixement": "1999-01-30",
        "sexe": "Dona",
        "nota_mitja": 8.9
      },
      {
        "nom": "Carles",
        "cognoms": "Tortosa Gisbert",
        "dni": "10987654K",
        "data_naixement": "2000-04-05",
        "sexe": "Home",
        "nota_mitja": 7.0
      },
      {
        "nom": "Laura",
        "cognoms": "Gómez Ferrer",
        "dni": "54321098L",
        "data_naixement": "1997-10-18",
        "sexe": "Dona",
        "nota_mitja": 8.0
      },
      {
        "nom": "Xavier",
        "cognoms": "Navarro Vidal",
        "dni": "98765432M",
        "data_naixement": "1998-06-28",
        "sexe": "Home",
        "nota_mitja": 7.3
      },
      {
        "nom": "Eva",
        "cognoms": "Ferrer Tormo",
        "dni": "12345678N",
        "data_naixement": "1999-03-08",
        "sexe": "Dona",
        "nota_mitja": 8.7
      },
      {
        "nom": "Roger",
        "cognoms": "Soler Martí",
        "dni": "87654321O",
        "data_naixement": "2000-02-14",
        "sexe": "Home",
        "nota_mitja": 6.7
      },
      {
        "nom": "Aina",
        "cognoms": "Vidal Ferrer",
        "dni": "13579246P",
        "data_naixement": "1997-09-30",
        "sexe": "Dona",
        "nota_mitja": 9.2
      },
      {
        "nom": "Ricard",
        "cognoms": "Tormo Fuster",
        "dni": "24680135Q",
        "data_naixement": "1998-12-11",
        "sexe": "Home",
        "nota_mitja": 7.9
      },
      {
        "nom": "Sara",
        "cognoms": "Ferrer Serra",
        "dni": "98765432R",
        "data_naixement": "1999-05-20",
        "sexe": "Dona",
        "nota_mitja": 8.4
      },
      {
        "nom": "Aleix",
        "cognoms": "Soler Martínez",
        "dni": "56789012S",
        "data_naixement": "2000-08-07",
        "sexe": "Home",
        "nota_mitja": 6.0
      },
      {
        "nom": "Júlia",
        "cognoms": "Gisbert Soler",
        "dni": "34567890T",
        "data_naixement": "1997-01-25",
        "sexe": "Dona",
        "nota_mitja": 8.6
      }
    ]
  }

function generarAlumnes() {
      return colleccioAlumnes.alumnes;
}

function nouAlumne(nom, cognoms, dni, datanaixement, sexe, notamitja)
{

}

function inserirAlumne(alumne)
{

}

function eliminarAlumne()
{
  
}
  

  
function mostrarAlumnes(){
  var contenedor = document.getElementById("contenedor");
  var table = document.createElement("table");
  
  contenedor.appendChild(table);
  var alumnes = generarAlumnes();

  for(var i = 0; i < alumnes.length; i++){
      var tr = document.createElement("tr");
      
      var celda = document.createElement("td");
      celda.innerHTML = alumnes[i].nom;
      tr.appendChild(celda);

      var celda = document.createElement("td");
      celda.innerHTML = alumnes[i].cognoms;
      tr.appendChild(celda);


      var celda = document.createElement("td");
      celda.innerHTML = alumnes[i].dni;
      tr.appendChild(celda);

      var celda = document.createElement("td");
      celda.innerHTML = alumnes[i].data_naixement;
      tr.appendChild(celda);


      var celda = document.createElement("td");
      celda.innerHTML = alumnes[i].sexe;
      tr.appendChild(celda); 

      var celda = document.createElement("td");
      celda.innerHTML = alumnes[i].nota_mitja;
      tr.appendChild(celda);

      celda.className="nota";
      table.appendChild(tr);
  }

 
}
/*
function resaltarNotasAltas() {
  var alumnes = generarAlumnes();

  for (var i = 0; i < alumnes.length; i++) {
    var nota = alumnes[i].nota_mitja;

    if (nota > 8) {
      var fila = document.getElementsByTagName("tr")[i + 1]; 
      fila.style.color = "blue";
    }
  }
}
*/

function resaltarNotasAltas() {
  var alumnes = generarAlumnes();
  var filas = document.querySelectorAll("#contenedor table tr");

  for (var i = 0; i < alumnes.length; i++) {
    var nota = alumnes[i].nota_mitja;

    if (nota > 8) {
      filas[i + 1].style.color = "blue"; 
    }
  }
}

function marcarNota(nota){
    var celda = document.querySelectorAll("td.nota");
    for (var i = 0; i < celda.length; i++) {
      if(parseFloat(celda[i].textContent) > nota) {
        celda[i].parentNode.style.color = "blue";
      }
    }
}

document.addEventListener("DOMContentLoaded", function() {
  mostrarAlumnes();
  marcarNota(8);
});

/*
function resaltarNotasMayoresASeis() {
  var celdasNotasMayoresSeis = document.querySelectorAll("td.nota");

  celdasNotasMayoresSeis.forEach(function(celda) {
    if (parseFloat(celda.innerHTML) > 6) {
      celda.style.color = "blue";
    }
  });
}*/
/*
function resaltarUltimaColumna() {
  var filas = document.querySelectorAll('table tr');

  filas.forEach(function(fila) {
      var celdas = fila.querySelectorAll('td:last-child');
      var resaltar = false;

      celdas.forEach(function(celda) {
          if (parseFloat(celda.textContent) > 8) {
              resaltar = true;
          }
      });

      if (resaltar) {
          var todasLasCeldas = fila.querySelectorAll('td');
          todasLasCeldas.forEach(function(celda) {
              celda.style.color = 'blue';
          });
      }
  });
}*/
