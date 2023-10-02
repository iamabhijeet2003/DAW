// Define el límite como una constante global
const LIMIT = 4;

// Función para imprimir una pirámide en la consola
function imprimirPiramide5(caracter) {
    console.log("Pirámide 5:");

    for (let i = 1; i <= LIMIT; i++) {
        var linia = "";

        // Bucle para el contenido de cada línea
        for (let j = 1; j <= i * 2; j++) {
            linia += caracter;
        }

        console.log(linia);
    }
}

// Llama a la función para imprimir la pirámide con un carácter específico
imprimirPiramide5("*");
