// Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado.
// Así como el sumatorio y producto de todos ellos.

import java.util.Scanner;

public class Ej_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int suma=0;
        int producto=1;
        System.out.print("Dame un numero:");
        num = teclado.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println(i);
            suma = suma + i;
            producto= producto*i;
        }
        System.out.println("La Suma de todos los numeros es " + suma);
        System.out.println("El producto de los numeros es " + producto);
    }
}