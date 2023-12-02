
import java.util.Scanner;
import java.util.InputMismatchException;
//Realiza un programa para leer una secuencia de números no nulos que finalice con la introducción de un 0, 
//y que obtenga e imprima si ha leído algún núoero negativo, cuantos positivos y cuantos negativos.
public class Ej_08 {
    static class NumValido extends Exception{
        public NumValido(String message){
            super(message);
        }
    }
    public static void main(String[] args) throws NumValido{
        int valor=0;
        int contPositivos=0;
        int contNegativos=0;
        Scanner entrada= null;
        do{
            try{
                System.out.print("Introduce un valor: ");
                entrada = new Scanner(System.in);
                valor=entrada.nextInt();
                if(valor<0)
                    contNegativos++;
                if(valor>0)
                    contPositivos++;

            }
            
            catch(InputMismatchException exc){
                //System.out.println(exc.getMessage());
                System.out.println("Has introducido una letra, caracter etc.");
                entrada.nextLine();
            }
        }
        while(valor != 0);
        if(contNegativos>0){
            System.out.println("Se han leido numeros negativos.");
        }
        System.out.println("Se han introducido "+ contNegativos +" numeros negativos.");
        System.out.println("Se han introducido "+ contPositivos +" numeros negativos.");

    }
}
