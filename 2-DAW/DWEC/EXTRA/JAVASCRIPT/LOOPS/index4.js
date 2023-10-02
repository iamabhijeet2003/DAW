// Define el límite como una constante global
const LIMIT = 4;

// Función para imprimir una pirámide descendente en la consola
function imprimirPiramide2(caracter) {
    console.log("Pirámide 2:");
    
    for(let i = LIMIT; i >= 1; i--) {
        var linia = "";
        
        for(let j = i; j >= 1; j--) {
            linia += caracter;
        }
        
        console.log(linia);
    }
}

// Llama a la función para imprimir la pirámide con un carácter específico
imprimirPiramide2("*");
