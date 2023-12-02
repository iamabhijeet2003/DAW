/*
 * Realiza un programa que calcule el valor de elevar (sin utilizar el operador de potencia) un número real, A,
 * a un número exponente entero, B.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej_12 {
    static class NumValido extends Exception{
        public NumValido(String message){
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner entrada= null;
        int base=0;
        int exponente=0;
        int result=1;
        int contNegativos=0;
        
        
        try{
            entrada = new Scanner(System.in);
            System.out.print("Introduce la base : ");
            base =  entrada.nextInt();
            System.out.print("Introduce el exponente: ");
            exponente = entrada.nextInt(); 
            for(int i=1; i <= exponente; i++){
                result = result*base;
            }
            if(base<0)
                contNegativos++;
        }     
        catch (InputMismatchException excErr){
            System.out.println("Has introducido una letra, caracter etc.");
            
       
        }
        finally{
            entrada.nextLine();
        }
        System.out.println("El numero "+base+" elevado al "+ exponente+" es: "+ result);
       
        if(contNegativos>0){
            System.out.println("Se han introducido valores negativos. ");
        }
        

    }
}
