import java.util.Random;

public class buscaminas {

    public class TableroJocBuscaminas {

        private int numFiles;
        private int numColumnes;
        private int numMines;
        public Casilla[][] casillas;
    
        public TableroJocBuscaminas(int numFilesIn, int numColumnesIn, int numMinesIn) {
            numFiles = numFilesIn;
            numColumnes = numColumnesIn;
            numMines = numMinesIn;
            casillas = new Casilla[numFiles][numColumnes];
            inicializarCasillas();
        }
    
        private void inicializarCasillas() {

            for (int i = 0; i < numFiles; i++) {
                for (int j = 0; j < numColumnes; j++) {
                    casillas[i][j] = new Casilla(i, j);
                }
            }
            generarMinas();
        }
        
        public void generarMinas() {
            int numMinasGeneradas = 0;
            Random rnd = new Random();
        
            // Mientras no se hayan generado todas las minas
            while (numMinasGeneradas < numMines) {
                // Elegimos una posición aleatoria en el tablero
                int fila = rnd.nextInt(numFiles);
                int col = rnd.nextInt(numColumnes);
        
                // Si la casilla no tiene mina, la asignamos
                if (!casillas[fila][col].esMina()) {
                    casillas[fila][col].posarMina();
                    numMinasGeneradas++;
                }
            }
        }
        
        public Casilla[] obtenerCasillasAlVoltante(int fila, int col) {
            int numCasillas = 0;
            Casilla[] casillasAdyacentes = new Casilla[8];
        
            // Recorremos todas las casillas alrededor de la casilla (fila, col)
            for (int i = fila - 1; i <= fila + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    // Si la casilla (i, j) está dentro del tablero y no es la misma que (fila, col)
                    if (i >= 0 && i < numFiles && j >= 0 && j < numColumnes && (i != fila || j != col)) {
                        // Añadimos la casilla (i, j) al array de casillas adyacentes
                        casillasAdyacentes[numCasillas] = casillas[i][j];
                        numCasillas++;
                    }
                }
            }
        
            // Redimensionamos el array de casillas adyacentes para que tenga exactamente numCasillas elementos
            Casilla[] resultado = new Casilla[numCasillas];
            for (int i = 0; i < numCasillas; i++) {
                resultado[i] = casillasAdyacentes[i];
            }
        
            return resultado;
        }
        
        
    
    }
    
}
 
/* 
 import java.util.Random;

public class TableroJocBuscaminas {
    private int numFiles;
    private int numColumnes;
    private int numMines;
    private int numCasillasSinMina;
    private Casilla[][] casillas;

    public TableroJocBuscaminas(int numFilesIn, int numColumnesIn, int numMinesIn) {
        this.numFiles = numFilesIn;
        this.numColumnes = numColumnesIn;
        this.numMines = numMinesIn;
        this.numCasillasSinMina = numFilesIn * numColumnesIn - numMinesIn;
        this.casillas = new Casilla[numFilesIn][numColumnesIn];
        inicializarCasillas();
    }

    public void inicializarCasillas() {
        for (int fila = 0; fila < numFiles; fila++) {
            for (int col = 0; col < numColumnes; col++) {
                casillas[fila][col] = new Casilla(fila, col);
            }
        }
        generarMinas();
    }

    public void generarMinas() {
        int numMinasGeneradas = 0;
        Random rnd = new Random();

        while (numMinasGeneradas < numMines) {
            int fila = rnd.nextInt(numFiles);
            int col = rnd.nextInt(numColumnes);

            if (!casillas[fila][col].esMina()) {
                casillas[fila][col].asignarMina();
                numMinasGeneradas++;
            }
        }
    }

    public boolean destaparCasilla(int fila, int col) {
        Casilla casilla = casillas[fila][col];

        if (casilla.estaDestapada() || casilla.estaMarcada()) {
            return false;
        }

        casilla.destapar();
        numCasillasSinMina--;

        if (casilla.esMina()) {
            return true;
        }

        if (casilla.numMinasAlVoltante() == 0) {
            Casilla[] casillasAdyacentes = obtenerCasillasAlVoltante(fila, col);
            for (Casilla casillaAdyacente : casillasAdyacentes) {
                destaparCasilla(casillaAdyacente.getFila(), casillaAdyacente.getCol());
            }
        }

        return false;
    }

    public boolean marcarCasilla(int fila, int col) {
        Casilla casilla = casillas[fila][col];

        if (casilla.estaDestapada()) {
            return false;
        }

        casilla.marcar();
        return true;
    }

    public boolean desmarcarCasilla(int fila, int col) {
        Casilla casilla = casillas[fila][col];

        if (!casilla.estaMarcada()) {
            return false;
        }

        casilla.desmarcar();
        return true;
    }

}
*/