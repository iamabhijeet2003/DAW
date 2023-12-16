window.onload = function generarString() {
    var string = "";
    var palabras = ["lorem","ipsum","dolor","sit","amet","consectetur","adipiscing","el","la", "mollit", "sed", "do", "eiusmod"];

    for(var i=0; i<palabras.length; i++){
        string += palabras[i] + " "; 
    }
    document.getElementById("resultado").innerHTML = string;
}
