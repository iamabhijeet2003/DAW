import java.util.Scanner;
/*
   Hacer un programa que le pida una frase al usuario. Posteriormente pedirá dos vocal y reempla-
   zará la primera vocal por la segunda, caso de estar. Para hacerlo, resolver de dos maneras:
        Con todas las funciones auxiliares que queramos. 
        Solo pudiendo usar length().
 */
public class Ejercicio_Strings2 {
    public static void main(String[] args) {
        String frase = "";
        String fraseSalida = "";
        char vocalASustituir;
        char vocalSustituta;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la frase: ");
        frase = entrada.nextLine();

        System.out.println("Dame la vocal a sustituir: ");
        vocalASustituir = entrada.nextLine().charAt(0);

        System.out.println("Dame la vocal que sustituira: ");
        vocalSustituta = entrada.nextLine().charAt(0);

        //frase= frase.replace(vocalASustituir, vocalSustituta);
        //System.out.println(frase);

        for(int i=0; i<frase.length();i++){
            if(frase.charAt(i)==vocalASustituir){
                fraseSalida += vocalSustituta;
            }
            else{
               fraseSalida+=frase.charAt(i);
            }
        }
        System.out.println(fraseSalida);
    }
}
