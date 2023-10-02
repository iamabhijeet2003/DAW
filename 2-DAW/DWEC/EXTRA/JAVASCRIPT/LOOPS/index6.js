// Define el límite como una constante global
const LIMIT = 4;

// Función para imprimir una pirámide en la consola
function imprimirPiramide4(caracter) {
    console.log("Pirámide 4:");

    for (let i = LIMIT; i >= 1; i--) {
        var linia = "";

        // Espacios en blanco
        for (let k = i; k <= LIMIT; k++) {
            linia += " ";
        }

        // Asteriscos
        for (let j = i; j >= 1; j--) {
            linia += caracter;
        }

        console.log(linia);
    }
}

// Llama a la función para imprimir la pirámide con un carácter específico
imprimirPiramide4("*");
