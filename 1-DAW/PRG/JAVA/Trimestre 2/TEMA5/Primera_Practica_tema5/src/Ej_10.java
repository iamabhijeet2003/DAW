/*
 Realiza un programa para leer una secuencia de notas (con valores que van de 0 a 10) que acaba
 con el valor -1 y nos dice si hay o no alguna nota de valor 10. 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej_10 {
    static class NumValido extends Exception{
        public NumValido(String message){
            super(message);
        }
    }
    public static void main(String[] args) throws NumValido{
        int valor=0;
        int numDieces=0;
        Scanner entrada= null;
        do{
            try{
                System.out.print("Introduce una nota: ");
                entrada = new Scanner(System.in);
                valor=entrada.nextInt();
                if(valor<0 || valor>10 ) throw new NumValido("Numero menor que cero o no valido.");
                if (valor==10)
                    numDieces++;


            }
            catch(NumValido exc){
                System.out.println(exc.getMessage());
                entrada.nextLine();
            }
            catch(InputMismatchException exc){
                //System.out.println(exc.getMessage());
                System.out.println("Has introducido una letra, caracter etc.");
                entrada.nextLine();
            }
        }
        while(valor != -1);

        System.out.println((numDieces>0) ? "Hay notas de 10": "No hay alumnos con 10" );
    }
}
