function calcularCalificacion() {
    const notaInput = document.getElementById('nota').value;
    const nota = parseFloat(notaInput);
  
    if (isNaN(nota) || nota < 0 || nota > 10) {
      mostrarResultado('La nota ingresada no es válida. Por favor, introduce una nota entre 0 y 10.');
      return;
    }
  
    let calificacion = '';
  
    if (nota < 5) {
      calificacion = 'Insuficiente';
    } else if (nota >= 5 && nota < 7) {
      calificacion = 'Suficiente';
    } else if (nota >= 7 && nota < 8) {
      calificacion = 'Bien';
    } else if (nota >= 8 && nota < 9) {
      calificacion = 'Notable';
    } else {
      calificacion = 'Excelente';
    }
  
    mostrarResultado(`La calificación obtenida es: ${calificacion} para la nota ${notaInput}.`);
  }
  
  function mostrarResultado(mensaje) {
    document.getElementById('resultado').innerText = mensaje;
  }
  