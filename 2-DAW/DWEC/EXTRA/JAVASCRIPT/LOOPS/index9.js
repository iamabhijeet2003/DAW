// Define el límite como una constante global
const LIMIT = 4;

// Función para imprimir una pirámide en la consola
function imprimirPiramide7(caracter) {
    console.log("Pirámide 7:");

    for (let i = 0; i < LIMIT; i++) {
        var linia = "";

        // Espacios en blanco
        for (let j = 0; j < i * 2; j++) {
            linia += " ";
        }

        // Asteriscos
        for (let k = 0; k < (LIMIT - i) * 2 - 1; k++) {
            linia += caracter;
        }

        console.log(linia);
    }
}

// Llama a la función para imprimir la pirámide con un carácter específico
imprimirPiramide7("*");
