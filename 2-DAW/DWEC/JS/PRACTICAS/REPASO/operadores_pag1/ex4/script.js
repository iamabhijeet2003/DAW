function convertirAFloat() {

    var inputNumero = document.getElementById("numero").value;
  
    if (Number.isInteger(parseFloat(inputNumero))) {
      var numeroFloat = parseFloat(inputNumero) + 0.1;

      document.getElementById("resultado").innerHTML = "El número convertido a float es: " + numeroFloat;
    } else {
      
      document.getElementById("resultado").innerHTML = "Por favor, ingrese un número entero.";
    }
  }
  