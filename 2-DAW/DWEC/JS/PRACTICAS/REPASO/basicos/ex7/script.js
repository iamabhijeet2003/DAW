var matriz = [];
var rowyCol=5;
for(var i=0;i<rowyCol;i++){
    matriz[i] = [];
    for(var j=0;j<rowyCol;j++){
        matriz[i][j] = " ";
        
    }
}

var bombasColocadas = 0;
while(bombasColocadas<10){
    let fila = Math.floor(Math.random() * 5);
    let col = Math.floor(Math.random() * 5);

    if(matriz[fila][col] == " "){
        matriz[fila][col] = "B";
        bombasColocadas++;
    }
}
console.log(matriz);
var cordenadaX = parseInt(prompt("Ingrese la coordenada X entre 1 y 5: "));
var cordenadaY = parseInt(prompt("Ingrese la coordenada Y entre 1 y 5: "));

if(matriz[cordenadaY-1] && matriz[cordenadaY-1][cordenadaX-1] == "B"){
    console.log("¡Hay una bomba en esa posición!");
}else{
    console.log("No hay bomba en esa posición.");
}