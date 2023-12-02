import java.util.Scanner;
//Hacer un programa que lea una palabra o frase y la gire del revés.Comprobar que si esta frase es o no palíndroma.
public class Ejercicio_Strings3 {
    public static void main(String[] args) {
        String frase = "";
        String fraseSalida = "";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame una frase o una palabra: ");
        frase=entrada.nextLine();

        for(int i=frase.length()-1; i>=0; i--){
            fraseSalida += frase.charAt(i);
        }
        System.out.println(fraseSalida);
        if(frase.equals(fraseSalida)){
            System.out.println("La frase introducida es palindromo");
        }
        else
            System.out.println("La frase no es palindromo");
    }
}
