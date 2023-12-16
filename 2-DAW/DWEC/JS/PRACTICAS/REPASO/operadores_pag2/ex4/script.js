window.onload = function() {
var array = [];

for(var i=0; i<100; i++) {
    let numeros = Math.floor(Math.random() * 10);
    array.push(numeros);
}
console.log(array);


var uno = 0;
var dos = 0;
var tres = 0;
var cuatro = 0;
var cinco = 0;
var seis = 0;
var siete = 0;
var ocho = 0;
var nueve = 0;

for(var i=0; i<array.length; i++) {
    switch(array[i]) {
        case 1:
            uno++;
            break;
        case 2:
            dos++;
            break;
        case 3:
            tres++;
            break;
        case 4:
            cuatro++;
            break;
        case 5:
            cinco++;
            break;
        case 6:
            seis++;
            break;
        case 7:
            siete++;
            break;
        case 8:
            ocho++;
            break;
        case 9:
            nueve++;
            break;
    }
}

// console.log("Uno: " + uno);
// console.log("Dos: " + dos);
// console.log("Tres: " + tres);
// console.log("Cuatro: " + cuatro);
// console.log("Cinco: " + cinco);
// console.log("Seis: " + seis);
// console.log("Siete: " + siete);
// console.log("Ocho: " + ocho);
// console.log("Nueve: " + nueve);
           

var resultado = "<h3>Repeticion de numeros en el array: </h3>" +
                "Uno: "+uno +"<br>" +
                "Dos: "+dos +"<br>"+
                "Tres: "+tres +"<br>" +
                "Cuatro: "+cuatro+"<br>" +
                "Cinco: " + cinco + "<br>" + 
                "Seis: " + seis+ "<br>" + 
                "Siete: " + siete + "<br>" + 
                "Ocho: " + ocho+ "<br>" + 
                "Nueve: " + nueve;


document.getElementById("resultado").innerHTML =  resultado;

}