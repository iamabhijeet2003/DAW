//Hacer una función recursiva que muestre en pantalla los digitos de un numero entero 
//positivo en orden inverso

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = entrada.nextInt();
        System.out.print("El número en orden inverso es: ");
        mostrarDigitosInversos(numero);
    }

    public static void mostrarDigitosInversos(int numero) {
        if (numero < 10) {
            System.out.print(numero);
        } else {
            System.out.print(numero % 10);
            mostrarDigitosInversos(numero / 10);
        }
    }
}
