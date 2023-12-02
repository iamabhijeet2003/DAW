import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * Haz un programa que lea las 20 notas de unos alumnos,todas ellas entre 0 y 10.
   Acontinuación, y con un solo bucle tendrá que calcularse:
        La nota más alta
        La nota más baja
        La nota mediana
        Informar si ha habido algún 10 y/o algún 0
 */
public class Ejercicio_Vector2 {

    static class NumValido extends Exception{
        public NumValido(String message){
            super(message);
        }
    }
    public static void main(String[] args) throws NumValido {
        int alumnos = 12;
        int notas[] = new int[alumnos];
        Scanner notaEntrada = null;
        int suma = 0;
        int mediana = 0;
        int notaMasAlta = 0;
        int notaMasBaja = 10;
        int contSiHayDiez = 0;
        int contSiHayZero = 0;

        
            try{
                notaEntrada = new Scanner(System.in);
                for(int i=0; i<notas.length; i++){
                    System.out.print("Introduce la nota de alumno " + (i+1) + " : ");
                    notas[i] = notaEntrada.nextInt();

                    if(notas[i]<0 || notas[i]>10 ) throw new NumValido("Numero menor que cero o no valido.");

                    suma += notas[i];
                    mediana = suma/alumnos;

                    if(notas[i] > notaMasAlta){
                        notaMasAlta = notas[i];
                    }
                    
                    if(notas[i]< notaMasBaja){
                        notaMasBaja = notas[i];
                    }
                    
                    if(notas[i]==10){
                        contSiHayDiez += 1;
                    }

                    if(notas[i]==0){
                        contSiHayZero += 1;
                    }
                }
            }
            catch (InputMismatchException excErr){
                System.out.println("Has introducido una letra, caracter etc.");
                notaEntrada.nextLine();
            }

            System.out.println(" ");

            System.out.println("·La media de las notas de alumnos es: " + mediana);
            System.out.println("·La nota más alta es: " + notaMasAlta);
            System.out.println("·La nota más baja es: "+ notaMasBaja);

            if(contSiHayDiez>0)
                System.out.println("·Hay notas de 10.");
            

            if(contSiHayZero>0)
                System.out.println("·Hay notas de 0.");

            System.out.println(" ");
        
        
    }
}
