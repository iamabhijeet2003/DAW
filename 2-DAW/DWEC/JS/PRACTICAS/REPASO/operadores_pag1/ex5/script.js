function calcularArea() {
    var radio = document.getElementById("radio").value;

    if (isNaN(radio)) {
        alert("Por favor, ingrese un número válido para el radio.");
        return;
    }

    var area = Math.PI * Math.pow(parseFloat(radio), 2);

    document.getElementById("resultado").innerHTML = "El área de la circunferencia con radio " + radio + " es: " + area.toFixed(2);
}
