function sumar() {
  let num1 = parseFloat(prompt("Ingrese el primer número:"));
  let num2 = parseFloat(prompt("Ingrese el segundo número:"));

  let resultado = num1 + num2;
  mostrarResultado(resultado);
}

function restar() {
  let num1 = parseFloat(prompt("Ingrese el primer número:"));
  let num2 = parseFloat(prompt("Ingrese el segundo número:"));

  let resultado = num1 - num2;
  mostrarResultado(resultado);
}

function dividir() {
  let num1 = parseFloat(prompt("Ingrese el primer número:"));
  let num2 = parseFloat(prompt("Ingrese el segundo número:"));

  if (num2 === 0) {
    mostrarResultado("No se puede dividir por cero");
  } else {
    let resultado = num1 / num2;
    mostrarResultado(resultado);
  }
}

function multiplicar() {
  let num1 = parseFloat(prompt("Ingrese el primer número:"));
  let num2 = parseFloat(prompt("Ingrese el segundo número:"));

  let resultado = num1 * num2;
  mostrarResultado(resultado);
}

function salir() {
  mostrarResultado("Hasta luego");
}

function mostrarResultado(resultado) {
  let resultadoDiv = document.getElementById("resultado");
  resultadoDiv.innerHTML = `Resultado: ${resultado}`;
}
