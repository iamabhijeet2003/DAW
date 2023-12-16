function numEntero() {
    var numero = document.getElementById("numeroInput").value;
    var numeroConvertido = parseFloat(numero);

    if (Number.isInteger(numeroConvertido)) {
        document.getElementById("resultado").innerHTML = "El número introducido es entero";
    } else {
        document.getElementById("resultado").innerHTML = "El número introducido no es entero";
    }
}
