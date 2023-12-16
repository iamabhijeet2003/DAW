function numEntero() {
    var numero = document.getElementById("numeroInput").value;
    var numeroConvertido = parseFloat(numero);

    if (Number.isInteger(numeroConvertido)) {
        return true;  
    } else {
        return false; 
    }
}

function numFloat(numero) {
    var numeroConvertido = parseFloat(numero);
    if (!Number.isNaN(numeroConvertido) && !Number.isInteger(numeroConvertido)) {
        return numeroConvertido.toFixed(2);
    }
    return null;
}

function calcularNumeroDeVerdad() {
    var numero = document.getElementById("numeroInput").value;
    var esInt = numEntero();

    if (esInt) {
        document.getElementById("resultado").innerHTML = "El número introducido es entero";
    } else {
        var numFloatResult = numFloat(numero);

        if (numFloatResult !== null) {
            document.getElementById("resultado").innerHTML = "El número introducido es un float con dos decimales: " + numFloatResult;
        } else {
            document.getElementById("resultado").innerHTML = "El número introducido no es un número válido.";
        }
    }
}
