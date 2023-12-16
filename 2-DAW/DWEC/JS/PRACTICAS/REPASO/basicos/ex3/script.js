
var altura = parseFloat(prompt("Ingresa tu altura en metros (por ejemplo, 1.75):"));
var peso = parseFloat(prompt("Ingresa tu peso en kilogramos:"));

var imc = peso / (altura * altura);

if (!isNaN(imc)) {
  var mensaje = "Tu IMC es: " + imc.toFixed(2) + ". ";

  if (imc < 18.5) {
    mensaje += "Estás bajo peso.";
  } else if (imc >= 18.5 && imc < 25) {
    mensaje += "Tienes un peso normal.";
  } else if (imc >= 25 && imc < 30) {
    mensaje += "Sobrepeso.";
  } else {
    mensaje += "Tienes obesidad.";
  }

  alert(mensaje);
} else {
  alert("Por favor, ingresa valores válidos para altura y peso.");
}
