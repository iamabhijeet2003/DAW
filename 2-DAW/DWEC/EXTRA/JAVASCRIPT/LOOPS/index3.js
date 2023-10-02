// Define el límite como una constante global
const LIMIT = 4;

// Función para imprimir una pirámide en la consola
function imprimirPiramide1(caracter) {
    console.log("Pirámide 1:");
    
    for(let i = 0; i <= LIMIT; i++) {
        var linia = "";
        
        for(let j = 0; j < i; j++) {
            linia += caracter;
        }
        
        console.log(linia);
    }
}

// Llama a la función para imprimir la pirámide con un carácter específico
imprimirPiramide1("*");
