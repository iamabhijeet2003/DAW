function calcularCuadrado() {
    var numero = document.getElementById("numeroInput").value;
    if (numero >= 1 && numero <= 50) {
        var cuadrado = numero * numero;
        document.getElementById("resultado").innerHTML = "El cuadrado de " + numero + " es: " + cuadrado;
    } else {
        document.getElementById("resultado").innerHTML = "Por favor, introduce un número entre 1 y 50.";
    }
}
