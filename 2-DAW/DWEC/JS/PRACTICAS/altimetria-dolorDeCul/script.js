const coleccionPuertos = {
  "Pirineos": [
    {
      "nombre": "Tourmalet",
      "altitud": "2115m",
      "longitud": "17km",
      "pendiente": "7.3%",
      "desnivel": "1268m",
      "coeficiente_APM": 315,
      "imagen_altimetria": "Tourmalet2.gif"
    },
    {
      "nombre": "Coll de la Gallina",
      "altitud": "1910m",
      "longitud": "11.76km",
      "pendiente": "8.36%",
      "desnivel": "982m",
      "coeficiente_APM": 263,
      "imagen_altimetria": "LaGallina.gif"
    }
  ],
  "Picos_de_Europa": [
    {
      "nombre": "Lagos de Covadonga",
      "altitud": "1124m",
      "longitud": "13.9km",
      "pendiente": "6.92%",
      "desnivel": "962m",
      "coeficiente_APM": 268,
      "imagen_altimetria": "Lagos.gif"
    },
    {
      "nombre": "El Angliru",
      "altitud": "1572m",
      "longitud": "12.4km",
      "pendiente": "10.21%",
      "desnivel": "1266m",
      "coeficiente_APM": 514,
      "imagen_altimetria": "alto_ANGLIRU_altimetria.jpg"
    }
  ]
};

function generarDatos() {
  const datosPirineos = coleccionPuertos.Pirineos;
  const datosPicosEuropa = coleccionPuertos.Picos_de_Europa;
  return [...datosPirineos, ...datosPicosEuropa];
}


function mostrarPuertos(puertos) {
    const contenidoDiv = document.getElementById("contenido");
    contenidoDiv.innerHTML = ""; // Borrar contenido anterior
  
    puertos.forEach((puerto) => {
      const listaPuerto = document.createElement("ul");
  
  const nombre = document.createElement("li");
  nombre.textContent = `Nombre: ${puerto.nombre}`;
  listaPuerto.appendChild(nombre);

  const altitud = document.createElement("li");
  altitud.textContent = `Altitud: ${puerto.altitud}m`;
  listaPuerto.appendChild(altitud);

  const longitud = document.createElement("li");
  longitud.textContent = `Longitud: ${puerto.longitud}m`;
  listaPuerto.appendChild(longitud);

  const pendiente = document.createElement("li");
  pendiente.textContent = `Pendiente: ${puerto.pendiente}m`;
  listaPuerto.appendChild(pendiente);

  const desnivel = document.createElement("li");
  desnivel.textContent = `Desnivel: ${puerto.desnivel}m`;
  listaPuerto.appendChild(desnivel);

  const coeficiente_APM = document.createElement("li");
  coeficiente_APM.textContent = `Coeficiente APM: ${puerto.coeficiente_APM}`;
  listaPuerto.appendChild(coeficiente_APM);
  
/*
  const imagen = document.createElement("img");
  imagen.src = puerto.imagen_altimetria;
  imagen.style.width="300px";
  listaPuerto.appendChild(imagen);
*/
const botonImagen = document.createElement("button");
botonImagen.textContent = "Mostrar Imagen";
listaPuerto.appendChild(botonImagen);
  
      // Evento al hacer clic en un puerto
      listaPuerto.addEventListener("click", () => {
        // Mostrar imágenes del puerto en el div contenido

        
      });

      /*
  function mostrarImagen(imagenSrc) {
  const contenidoDiv = document.getElementById("contenido");
  contenidoDiv.innerHTML = ""; // Limpiar el contenido anterior

  const imagenMostrada = document.createElement("img");
  imagenMostrada.src = imagenSrc;
  imagenMostrada.style.width = "80%";
  contenidoDiv.appendChild(imagenMostrada);
}*/
botonImagen.addEventListener("click", () => {
  mostrarImagen(puerto.imagen_altimetria);
}); 

function mostrarImagen(imagenSrc) {
  const contenidoDiv = document.getElementById("contenido");
  contenidoDiv.innerHTML = ""; // Limpiar el contenido anterior

  const imagenMostrada = document.createElement("img");
  imagenMostrada.src = imagenSrc;
  imagenMostrada.style.width = "300px";
  contenidoDiv.appendChild(imagenMostrada);
}

      contenidoDiv.appendChild(listaPuerto);
    });
  }



// Función para abrir formulario de contacto
function abrirFormulario() {
  const formulario = document.getElementById("formularioContacto");
  formulario.style.display = "block"; // Mostrar el formulario al hacer clic en el botón de contacto
}


function cerrarFormulario() {
  const formulario = document.getElementById("formularioContacto");
  formulario.style.display = "none"; // Ocultar el formulario al hacer clic en el botón de cerrar
}

// Lógica para cerrar el formulario al presionar un botón de cerrar

document.addEventListener("DOMContentLoaded", function() {
  // Tu código JavaScript aquí
  const botonContacto = document.getElementById("contacto");
  botonContacto.addEventListener("click", abrirFormulario);

  const botonCerrar = document.getElementById("cerrarFormulario");
  botonCerrar.addEventListener("click", cerrarFormulario);

  // Otro código que necesites ejecutar después de que el DOM esté completamente cargado

  const selectPuertos = document.getElementById("seleccion_puertos");
  selectPuertos.addEventListener("change", () => {
    const seleccion = selectPuertos.value;
    let datosPuertos;

    if (seleccion === "Todos_los_puertos") {
      datosPuertos = generarDatos();
    } else {
      datosPuertos = coleccionPuertos[seleccion];
    }

    mostrarPuertos(datosPuertos);
  });
});
