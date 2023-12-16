window.onload = function() {
    var array = [];

    for (var i = 0; i < 100; i++) {
        if (i >= 25 && i <= 75) {
            array.push(0);
        } else {
            let numero = Math.floor(Math.random() * 10);
            array.push(numero);
        }
    }

    console.log(array);
}
