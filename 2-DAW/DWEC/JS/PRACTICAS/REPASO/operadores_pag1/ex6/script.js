function division(){
    var numero1 = document.getElementById("num1").value;
    var numero2 = document.getElementById("num2").value;

    if (isNaN(numero1) || isNaN(numero2)) {
        alert("Por favor, ingrese un número válido para cada número.");
        return;
    }

    var numeroMayor;
    var numeroMenos;
    if(numero1>numero2){
        numeroMayor = numero1;
        numeroMenos = numero2;
    }else{
        numeroMayor = numero2;
        numeroMenos = numero1;
    }

    var division = Math.floor(numeroMayor / numeroMenos);
    var resto = numeroMayor % numeroMenos;

    document.getElementById("resultado").innerHTML = "El resultado de la division es: " + division.toFixed(2) + 
    " y el resto es: " + resto; 
}