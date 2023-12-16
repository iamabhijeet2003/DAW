window.onload = function ordenarAlfabeticamente(){
    var array = ["z","y","x","w","v","u","t","s","r","q","p","b","a"];
    console.log(array);
    var result = array.sort();
    
    document.getElementById("resultado").innerHTML = result;
}