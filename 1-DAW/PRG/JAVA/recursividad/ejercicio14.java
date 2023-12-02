//Función recursiva llamada palindromo que devuelva un booleano diciendo si la cadena 
//pasada como parámetro es un palíndromo o no.
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = entradaDatos.nextLine();
        if (palindromo(cadena)) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }
    }

    public static boolean palindromo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else {
            char primerCaracter = cadena.charAt(0);
            char ultimoCaracter = cadena.charAt(cadena.length() - 1);
            if (primerCaracter != ultimoCaracter) {
                return false;
            } else {
                String cadenaCentral = cadena.substring(1, cadena.length() - 1);
                return palindromo(cadenaCentral);
            }
        }
    }
}
