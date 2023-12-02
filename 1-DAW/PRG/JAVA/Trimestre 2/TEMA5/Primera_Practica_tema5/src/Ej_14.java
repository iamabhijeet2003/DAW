/*
 * Realiza un programa que dada una cantidad de euros (múltiplo de 5) realice el 
 * desglose de billetes (500, 200, 100, 50, 20, 10, 5), siempre intentando dar el mínimo de billetes posible.
 */
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej_14 {
    static class NumMultiplo extends Exception{    
        public NumMultiplo(String message){
            super(message);
        }
    }
    public static void main(String[] args) throws NumMultiplo {
        int valor=0;
        Scanner entrada = new Scanner(System.in);
        do{
            try{
                System.out.print("Introduce un numero (muktiplo de 5) :  ");
                valor = entrada.nextInt();
                if(valor%5 != 0) throw new NumMultiplo("Introduce un numero que seamultiplo de 5");
            }
            catch(NumMultiplo exc){
                System.out.println(exc.getMessage());
            }
            catch(InputMismatchException excErr){
                entrada.nextLine();
            }
            
        }
        while(valor%5!=0);
        System.out.println(" ---------------------------------------------------------------------");
        System.out.printf("| Para el valor %d se necesita el siguiente desglose de billetes:  |  \n", valor );
        System.out.println(" --------------------------------------------------------------------- ");
        //int  arrayBilletes[] = new int[7];
        //int arrayBilletes[] = {500,200,100,50,20,10,5};
        int arraySalida[] = new int[7];
        int contador = 0;
        while(valor-500 >= 0 ){
            arraySalida[0]=++contador;
            valor-=500;
        }
        contador=0;
        while(valor-200 >= 0 ){
            arraySalida[1]=++contador;
            valor-=200;
        }
        contador=0;
        while(valor-100 >= 0 ){
            arraySalida[2]=++contador;
            valor-=100;
        }
        contador=0;
        while(valor-50 >= 0 ){
            arraySalida[3]=++contador;
            valor-=50;
        }
        contador=0;
        while(valor-20 >= 0 ){
            arraySalida[4]=++contador;
            valor-=20;
        }
        contador=0;
        while(valor-10 >= 0 ){
            arraySalida[5]=++contador;
            valor-=10;
        }
        contador=0;
        while(valor-5 >= 0 ){
            arraySalida[6]=++contador;
            valor-=5;
        }
        //System.out.println(Arrays.toString(arraySalida));
        //System.out.printf("Para el valor %d se necesita el siguiente desglose de billetes. ", valor );
        System.out.printf("| Se necesitan %d de 500. | \n", arraySalida[0]);
        System.out.printf("| Se necesitan %d de 200. | \n", arraySalida[1]);
        System.out.printf("| Se necesitan %d de 100. | \n", arraySalida[2]);
        System.out.printf("| Se necesitan %d de 50.  | \n", arraySalida[3]);
        System.out.printf("| Se necesitan %d de 20.  | \n", arraySalida[4]);
        System.out.printf("| Se necesitan %d de 10.  | \n", arraySalida[5]);
        System.out.printf("| Se necesitan %d de 5.   | \n", arraySalida[6]);

        System.out.println(" ----------------------- ");
    }
}
