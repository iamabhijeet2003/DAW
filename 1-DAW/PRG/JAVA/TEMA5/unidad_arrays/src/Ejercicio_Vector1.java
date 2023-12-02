/*
 Programa que guarde los 100 primeros números pares en un vector. 
 Después se mostrará la suma de los últimos 30 números guardados.
 */
public class Ejercicio_Vector1 {
    public static void main(String[] args) {
        int N = 100;
        int[] vector = new int[N];
        int suma = 0;

        for(int i=0; i<N; i++ ){
            vector[i] = 2 * i;
        }

        for(int i= N - 30; i < N; i++){
            suma += vector[i];
        }

        System.out.println("La suma de los ultimos 30 numeros es: "+suma);
    }
}
