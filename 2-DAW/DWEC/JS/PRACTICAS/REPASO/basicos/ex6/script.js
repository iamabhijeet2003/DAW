window.onload = function() {
    var result = 0;
    var userInput;
    
    while (result < 1000) {
        userInput = parseFloat(prompt("Ingresa un número: "));
        
        if (isNaN(userInput)) {
            alert("No es un número. Inténtalo de nuevo.");
        } else {
            result += userInput;
            if (result >= 1000) {
                alert("¡Has llegado a 1000 o más!");
            }
        }
    }
    
    document.getElementById("resultado").innerHTML = result;
}