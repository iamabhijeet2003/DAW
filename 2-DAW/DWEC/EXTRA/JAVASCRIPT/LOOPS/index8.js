// Define el límite como una constante global
const LIMIT = 4;

// Función para imprimir una pirámide en la consola
function imprimirPiramide6(caracter) {
    console.log("Pirámide 6:");

    for (let i = LIMIT; i >= 0; i--) {
        var linia = "";

        // Bucle para el contenido de cada línea
        for (let j = i * 2; j > 1; j--) {
            linia += caracter;
        }

        console.log(linia);
    }
}

// Llama a la función para imprimir la pirámide con un carácter específico
imprimirPiramide6("*");
