document.addEventListener("DOMContentLoaded", function() {
  document.getElementById("formulario").addEventListener('submit', function(event) {
      event.preventDefault(); 
      
  });
});


function validadoFormulario(){
  
   if(validarFormulario()){
    mostrarDatos();
    
   }else{
    console.log("no se ha validado el formulario")
   }
}
function actualizarBotonEnviar() {
  var botonEnviar = document.getElementById("boton-enviar");
  var formularioValido = validarFormulario();
  botonEnviar.disabled = !formularioValido;
}


function validarFormulario(){
    var nombreValido = validarNombre();
    var correoValido = validarCorreo();
    var contrasenaValida = validarContrasena();
    var terminosValidos = validarTerminos();
    var comentariosValidos = validarComentarios();
    var opcionValida = validarOpcion();
    var fechaNacimiento = validarFechaNacimiento();
    var telefonoValidar = validarTelefono();
    //var seleccionValido = validarSeleccion();

    return (
            nombreValido && 
            correoValido && 
            contrasenaValida && 
            terminosValidos && 
            comentariosValidos && 
            opcionValida &&
            fechaNacimiento &&
            telefonoValidar
    );

}


function validarNombre(){
  var errorNombre = document.getElementById("error-nombre");
  var campoNombre = document.getElementById("nombre");
  var nombreValor = document.getElementById("nombre").value;
  if(nombreValor.length==0 || nombreValor==null){
    errorNombre.textContent = "El campo de nombre está vacío.";
    errorNombre.style.color="red";
    campoNombre.style.borderColor="red";
    return false;
  }else{
    errorNombre.textContent = "";
    campoNombre.style.borderColor="";  
    return true;
  }
}

function validarCorreo(){
  var correoValor = document.getElementById("correo").value;
  var campoCorreo = document.getElementById("correo");
  var errorCorreo = document.getElementById("error-correo");


   var regexCorreo = `/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/`;




  if(correoValor==0 || correoValor==null){
     errorCorreo.textContent="El campo de correo es vacio";
     errorCorreo.style.color="red";
     campoCorreo.style.borderColor="red";
     return false;
  }else{
    errorCorreo.textContent="";
    campoCorreo.style.borderColor="";
    return true;
  }
}

function validarContrasena() {
  var contrasenaError = document.getElementById("error-contrasena");
  var campoContrasena = document.getElementById("contrasena");
  var contrasena = campoContrasena.value;

  if (contrasena.length === 0 || contrasena === null) {
    contrasenaError.textContent = "El campo de contraseña está vacío.";
    contrasenaError.style.color="red";
    campoContrasena.style.borderColor = "red";
    return false;
  } else if (contrasena.length < 8) {
    contrasenaError.textContent = "La contraseña debe tener al menos 8 caracteres.";
    contrasenaError.style.color="red";
    campoContrasena.style.borderColor = "red";
    return false;
  } else {
    contrasenaError.textContent = "";
    campoContrasena.style.borderColor = "";
    return true;
  }
}

function validarFechaNacimiento() {
  var fechaNacimiento = document.getElementById("fecha_nacimiento").value;
  var errorFechaNacimiento = document.getElementById("error-fecha-nacimiento");
  var campoFecha=document.getElementById("fecha_nacimiento");
  if (!fechaNacimiento) {
    errorFechaNacimiento.textContent = "Debes ingresar una fecha de nacimiento.";
    errorFechaNacimiento.style.color="red";
    campoFecha.style.border=("red 2px solid");  
    return false;
  }

  var fechaNacimientoDate = new Date(fechaNacimiento);
  var hoy = new Date();

  if (isNaN(fechaNacimientoDate) || fechaNacimientoDate > hoy) {
    errorFechaNacimiento.textContent = "Ingresa una fecha de nacimiento válida y no posterior al día de hoy.";
    errorFechaNacimiento.style.color="red";
    return false;
  }

  errorFechaNacimiento.textContent = "";
  campoFecha.style.border="";
  return true;
}

function validarTelefono() {
  var numeroTelefono = document.getElementById("numero").value;
  var campoTelefono = document.getElementById("numero");
  var errorNumero = document.getElementById("error-numero");

  if (!numeroTelefono) {
    errorNumero.textContent = "Debes ingresar un número de teléfono.";
    errorNumero.style.color="red";
    campoTelefono.style.border="2px solid red";
    return false;
  }

  
  var numeroLimpio = numeroTelefono.replace(/[\s-]/g, "");

  if (numeroLimpio.length < 10) {
    errorNumero.textContent = "El número de teléfono debe tener al menos 10 dígitos.";
    errorNumero.style.color="red";
    return false;
  }

  errorNumero.textContent = "";
  campoTelefono.style.border="";
  return true;
}



function validarTerminos() {
  var terminosError = document.getElementById("error-terminos");
  var aceptarTerminos = document.getElementById("checkbox");
  var checkbox = document.getElementById("checkbox");

  if (!aceptarTerminos.checked) {
    terminosError.textContent = "Debes aceptar los términos y condiciones.";
    terminosError.style.color="red";
    aceptarTerminos.style.borderColor="red 2px solid";
    return false;
  } else {
    terminosError.textContent = "";
    return true;
  }
}
ñ
function validarComentarios() {
  var comentariosError = document.getElementById("error-comentarios");
  var campoComentarios = document.getElementById("area_texto");
  var comentarios = campoComentarios.value;

  if (comentarios.length === 0 || comentarios === null) {
    comentariosError.textContent = "El campo de comentarios está vacío.";
    comentariosError.style.color="red";
    campoComentarios.style.borderColor = "red";
    return false;
  } else {
    comentariosError.textContent = "";
    campoComentarios.style.borderColor = "";
    return true;
  }
}


function validarOpcion() {
  var radio1 = document.getElementById("radio1");
  var radio2 = document.getElementById("radio2");
  var errorOpcion = document.getElementById("error-opcion");

  if (!radio1.checked && !radio2.checked) {
    errorOpcion.textContent = "Debes seleccionar al menos una opción.";
    return false;
  } else {
    errorOpcion.textContent = "";
    return true;
  }
}
/*
function validarSeleccion() {
  var seleccion = document.getElementById("seleccion");
  var errorSeleccion = document.getElementById("error-seleccion");

  if (seleccion.value == "") {
    errorSeleccion.textContent = "Debes seleccionar una opción.";
    return false;
  } else {
    errorSeleccion.textContent = "";
    return true;
  }
}
*/


function mostrarDatos() {
  var nombre = document.getElementById("nombre").value;
  var correo = document.getElementById("correo").value;
  var contrasena = document.getElementById("contrasena").value;
  var fechaNacimiento = document.getElementById("fecha_nacimiento").value;
  var numero = document.getElementById("numero").value;
  var aceptarTerminos = document.getElementById("checkbox").checked ? "Aceptado" : "No aceptado";
  var opcionSeleccionada = document.querySelector('input[name="opcion"]:checked');
  var seleccion = document.getElementById("seleccion").value;
  var comentarios = document.getElementById("area_texto").value;

  var mensaje = "Datos del formulario:\n";
  mensaje += "Nombre: " + nombre + "\n";
  mensaje += "Correo electrónico: " + correo + "\n";
  mensaje += "Contraseña: " + contrasena + "\n";
  mensaje += "Fecha de nacimiento: " + fechaNacimiento + "\n";
  mensaje += "Número de teléfono: " + numero + "\n";
  mensaje += "Acepto los términos y condiciones: " + aceptarTerminos + "\n";
  mensaje += "Opción seleccionada: " + (opcionSeleccionada ? opcionSeleccionada.value : "Ninguna") + "\n";
  mensaje += "Opción seleccionada en el select: " + seleccion + "\n";
  mensaje += "Comentarios: " + comentarios;

  alert(mensaje);

}
