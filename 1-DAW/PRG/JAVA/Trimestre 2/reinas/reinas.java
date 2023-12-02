import java.util.Arrays;

public class reinas {
    public static void main(String[] args) {
        int dim=8;
        char [][] tablero;
        int [] arrayPos = {1, 2, 2, 8, 3, 6, 4, 7, 5, 3, 6, 5, 7, 7, 8, 4};
        tablero = crearTablero(dim);
        ponerReinas(tablero, arrayPos);
        
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }

        /* 
        for (int i = 1; i < arrayPos.length; i+=2) {
            buscarReinasH(arrayPos[i-1]-1, arrayPos[i]-1, tablero);
            buscarReinasV(arrayPos[i-1]-1, arrayPos[i]-1, tablero);
            buscarReinasDPos(arrayPos[i-1]-1, arrayPos[i]-1, tablero);
            //buscarReinasDNeg(arrayPos[i-1], arrayPos[i], tablero);
        }           
        */
        for (int i = 1; i < arrayPos.length; i += 2) {
            boolean atacando = false;
            if (buscarReinasH(arrayPos[i - 1] - 1, arrayPos[i] - 1, tablero)) {
                System.out.printf("La reina en la posición (%d, %d) se está atacando en horizontal\n", arrayPos[i - 1], arrayPos[i]);
                atacando = true;
            }
            if (buscarReinasV(arrayPos[i - 1] - 1, arrayPos[i] - 1, tablero)) {
                System.out.printf("La reina en la posición (%d, %d) se está atacando en vertical\n", arrayPos[i - 1], arrayPos[i]);
                atacando = true;
            }
            if (buscarReinasDPos(arrayPos[i - 1] - 1, arrayPos[i] - 1, tablero)) {
                System.out.printf("La reina en la posición (%d, %d) se está atacando en diagonal positiva\n", arrayPos[i - 1], arrayPos[i]);
                atacando = true;
            }
            if (buscarReinasDNeg(arrayPos[i - 1] - 1, arrayPos[i] - 1, tablero)) {
                System.out.printf("La reina en la posición (%d, %d) se está atacando en diagonal negativa\n", arrayPos[i - 1], arrayPos[i]);
                atacando = true;
            }
            if (!atacando) {
                System.out.printf("La reina en la posición (%d, %d) no se está atacando con ninguna otra reina\n", arrayPos[i - 1], arrayPos[i]);
            }
        }
/*         for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        } */
    }

    /* 
    private static boolean buscarReinasDPos(int i, int j, char[][] tablero) {
        int minFila =i;
        int minCol =j;
        int maxFila =i;
        int maxCol =j;
        int contCol =0;
        while (minFila!=0 && minCol !=0){
            minFila--;
            minCol--;
        }
        contCol=minCol;
        while (maxFila != tablero.length-1 && maxCol != tablero[0].length-1){
            maxFila++;
            maxCol++;
        }

        for (int k = minFila; k < maxFila; k++) {
            if (k!=i && contCol!=j){ // if(k!=i)
                    if (tablero[k][contCol]=='R')
                        return true;
                
            }
            if (contCol<=maxCol)
                contCol++;
        }
        return false;
    }
    */

    private static boolean buscarReinasDPos(int i, int j, char[][] tablero) {
        int minFila = i;
        int minCol = j;
        int maxFila = i;
        int maxCol = j;
        int contCol = j;
        while (minFila != 0 && minCol != 0) {
            minFila--;
            minCol--;
        }
        contCol = minCol;
        while (maxFila != tablero.length - 1 && maxCol != tablero[0].length - 1) {
            maxFila++;
            maxCol++;
        }
    
        for (int k = minFila; k <= maxFila; k++) {
            if (k != i && contCol != j) {
                if (tablero[k][contCol] == 'R')
                    return true;
            }
            if (contCol <= maxCol)
                contCol++;
        }
        
        minFila = i;
        minCol = j;
        maxFila = i;
        maxCol = j;
        contCol = j;
        while (minFila != 0 && maxCol != tablero[0].length - 1) {
            minFila--;
            maxCol++;
        }
        contCol = maxCol;
        while (maxFila != tablero.length - 1 && minCol != 0) {
            maxFila++;
            minCol--;
        }
    
        for (int k = minFila; k <= maxFila; k++) {
            if (k != i && contCol != j) {
                if (tablero[k][contCol] == 'R')
                    return true;
            }
            if (contCol >= minCol)
                contCol--;
        }
        
        return false;
    }
    
    private static boolean buscarReinasDNeg(int i, int j, char[][] tablero) {
        int minFila = i;
        int minCol = j;
        int maxFila = i;
        int maxCol = j;
        int contCol = 0;
        while (minFila != 0 && minCol != tablero[0].length - 1) {
            minFila--;
            minCol++;
        }
        contCol = minCol;
        while (maxFila != tablero.length - 1 && maxCol != 0) {
            maxFila++;
            maxCol--;
        }

        for (int k = minFila; k <= maxFila; k++) {
            if (k != i && contCol != j) {
                if (tablero[k][contCol] == 'R') {
                    return true;
                }
            }
            if (contCol >= maxCol) {
                contCol--;
            }
        }
        return false;
    }
    

    private static boolean buscarReinasH(int i, int j, char[][] tablero) {
        for (int k = 0; k < tablero[0].length; k++) {
            if (k!=j){
                if (tablero[i][k]=='R')
                    return true;
            }
        }
        return false;
    }

    private static boolean buscarReinasV(int i, int j, char[][] tablero) {
        for (int k = 0; k < tablero[0].length; k++) {
            if (k!=i){
                if (tablero[k][j]=='R')
                    return true;
            }
        }
        return false;
    }

    public static void ponerReinas(char [][] tablero,int[] arrayPos){
        for (int i = 1; i < arrayPos.length; i+=2) {
            tablero[arrayPos[i-1]-1][arrayPos[i]-1]='R';        
        }        
 
    }

    public static char[][] crearTablero(int dim){
        char [][] array = new char [dim][dim];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]='*';
            }
            
        }
        return array;
    }
}