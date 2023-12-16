function existeAnimal() {
    var nombresDeAnimales = [
        "León", "Elefante", "Jirafa",
        "Tigre", "Mono", "Zorro",
        "Canguro", "Cebra", "Oso",
        "Araña", "Perro", "Gato",
        "David"
    ];

    var animal = document.getElementById("animal").value;
    if (nombresDeAnimales.includes(animal)) {
        console.log("El animal existe");
        document.getElementById("resultado").innerHTML = "El animal existe";
    } else {
        console.log("El animal NO existe");
        document.getElementById("resultado").innerHTML = "El animal NO existe";
    }
}
