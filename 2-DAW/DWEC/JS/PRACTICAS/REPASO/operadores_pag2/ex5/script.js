window.onload = function() {
    var array = [];

    while (array.length < 25) {
        let numero = Math.floor(Math.random() * 100) + 1;
        if (!array.includes(numero)) {
            array.push(numero);
        }
    }

    console.log(array);
    document.getElementById("resultado").innerHTML = array.join(', '); 
}
