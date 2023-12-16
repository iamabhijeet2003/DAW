window.onload = function() {
        var numeros = [5, 12, 3, 9, 1, 8, 6, 15, 4, 7, 11, 2, 10, 14, 13];


        numeros.sort(function(a, b) {
        return a - b;
        });

       
        document.getElementById("resultado").innerHTML = numeros;
}