/*  Hacer un programa que:
        -Cree un vector de 100 elementos.
        -Llene cada casilla con su valor de la serie de fibbonacci ([1,1,2,3,5,8,etc. . . ]).
        -Hacer un bucle, desde el segundo elemento hasta el final, que calcule y muestre 
         por pantalla el cociente del elemento dividido por el anterior, con 12 decimales.
        -Comprobar este valor y fijarse que tiende al mismo número, el número de oro P hi (*phi)
*/
public class ejercicio17 {

    public static void main(String[] args) {
        double[] vector = new double[100];
        
        // Llenar el vector con la serie de Fibonacci
        vector[0] = 1;
        vector[1] = 1;
        for (int i = 2; i < vector.length; i++) {
            vector[i] = vector[i-1] + vector[i-2];
        }
        
        // Calcular el cociente y mostrar por pantalla
        for (int i = 1; i < vector.length; i++) {
            double cociente = vector[i] / vector[i-1];
            System.out.printf("Cociente entre el elemento %d y el anterior: %.12f\n", i, cociente);
        }
    }

}
