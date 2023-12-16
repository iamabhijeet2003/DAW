window.onload = function() {
    const words = ['spray', 'elite', 'exuberant', 'destruction', 'present'];
    
    const result = words.filter((word) => word.length > 6);

    document.getElementById("resultado").innerHTML = result;
}