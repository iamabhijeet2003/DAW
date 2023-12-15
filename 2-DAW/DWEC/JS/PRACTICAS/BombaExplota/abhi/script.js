document.addEventListener("DOMContentLoaded", function() {
    const bomba1 = document.getElementById("bombid");
    const zonaEliminacion = document.getElementById("eliminacion");

    let intervalo; // Variable para el intervalo de explosión
    let puntuacion = 0; // Puntuación inicial

    animarBomba(bomba1, 1);

    // Función para iniciar la explosión
    function iniciarExplosion() {
        intervalo = setTimeout(() => {
            bomba1.style.opacity = 0; // Hacer la bomba invisible al explotar
            puntuacion -= 300; // Restar puntos al explotar
            alert("¡La bomba ha explotado! Puntuación: " + puntuacion);
        }, 10000); // 10 segundos antes de la explosión
    }

    // Función para detener la explosión cuando se elimina la bomba
    function detenerExplosion() {
        clearTimeout(intervalo); // Detener el intervalo de explosión
    }

    // Detectar cuando se arrastra la bomba
    bomba1.addEventListener("dragstart", function(event) {
        iniciarExplosion(); // Iniciar la explosión al arrastrar la bomba
    });

    // Detectar cuando la bomba llega a la zona de eliminación
    zonaEliminacion.addEventListener("drop", function(event) {
        event.preventDefault();
        detenerExplosion(); // Detener la explosión al eliminar la bomba
        puntuacion += 200; // Sumar puntos al eliminar la bomba
        alert("¡Bomba eliminada! Puntuación: " + puntuacion);
    });

    zonaEliminacion.addEventListener("dragover", function(event) {
        event.preventDefault();
    });
});



const bombing = [
    "bomba10.png", "bomba9.png", "bomba8.png", "bomba7.png", "bomba6.png",
    "bomba5.png", "bomba4.png", "bomba3.png", "bomba2.png", "bomba1.png"
];
function animarBomba(bomba, segundos) {
    const intervalo = segundos * 1000 / bombing.length;

    for (let indice = 0; indice < bombing.length; indice++) {
        setTimeout(() => {
            bomba.style.opacity = 1;
            setTimeout(() => {
                bomba.style.backgroundImage = `url('${bombing[indice]}')`;
                bomba.style.opacity = 1;
            }, 200);
        }, intervalo * indice);
    }
}