
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
