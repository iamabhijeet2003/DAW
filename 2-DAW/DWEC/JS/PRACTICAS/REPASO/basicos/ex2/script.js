window.onload = function() {
    var numeros = [3, 2, 4, 5, 6, 7, 8, 9, 10, 23, 12, 11, 14, 1];
    var numeroMayor = 0;
    var numeroMenor = Infinity; 
    console.log(numeros);
    for (var i = 0; i < numeros.length; i++) {
        if (numeros[i] > numeroMayor) {
            numeroMayor = numeros[i];
        }
        if (numeros[i] < numeroMenor) {
            numeroMenor = numeros[i];
        }
    }
    var result = `El numero mayor es: ${numeroMayor} y el numero menor es: ${numeroMenor}`;
    document.getElementById("resultado").innerText = result;
}
