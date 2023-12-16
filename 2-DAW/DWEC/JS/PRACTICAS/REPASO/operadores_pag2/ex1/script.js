window.onload = function() {
    var matriz = [];
    var filas = 3;
    var columnas = 5;
    var resultado = "";
    var style = "border: 1px solid";
    for (var i = 0; i < filas; i++) {
        matriz[i] = [];
        for (var j = 0; j < columnas; j++) {
            matriz[i][j] = "f" + (i + 1) + "c" + (j + 1);
            resultado += '<span style="border: 1px solid  red;">' + matriz[i][j] + '</span>';
        }
        resultado += "<br>";
    }

    document.getElementById("matriz").innerHTML = resultado;
};
