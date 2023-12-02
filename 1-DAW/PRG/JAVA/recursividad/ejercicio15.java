
import java.util.Arrays;
//Implementa la función del ejercicio1 mostrarVectorInt y llama la mostrarVectorIntRec 
//que imprima el vector de manera recursiva.
public class ejercicio15 {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        System.out.println("El vector generado es:");
        mostrarVectorIntRec(vector, 0);
    }
    
    public static void mostrarVectorIntRec(int[] vector, int indice) {
        if (indice == vector.length) {
            System.out.println();
            return;
        }
        
        System.out.print(vector[indice]);
        if (indice < vector.length - 1) {
            System.out.print(", ");
        }
        
        mostrarVectorIntRec(vector, indice + 1);
    }
    
    public static void mostrarVectorInt(int[] vector) {
        System.out.println(Arrays.toString(vector));
    }
}

