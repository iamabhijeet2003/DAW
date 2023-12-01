window.onload = function() {
    crearRellotge();
    startTime();

}

function crearRellotge(){
    var divContent = document.getElementById("content");
    divContent.innerHTML = "";

    var elementClock = document.createElement("div");
    elementClock.id = "clock";
    divContent.appendChild(elementClock);
    elementClock.className="clockdate-wrapper";
    }


function startTime() {
    var today = new Date();
    var hr = today.getHours();
    var min = today.getMinutes();
    var sec = today.getSeconds();
    min = checkTime(min);
    sec = checkTime(sec);
    document.getElementById("clock").innerHTML = hr + " : " + min + " : " + sec;
    var time = setTimeout(function(){ startTime() }, 500);
}
    

    

function checkTime(i) {
        if (i < 10) {
            i = "0" + i;
        }
        return i;
}