
import java.util.Scanner;
import java.util.InputMismatchException;

//Realiza un programa para leer 100 números no nulos y que visualice un mensaje indicando cuantos 
//son positivos y cuantos negativos.
public class Ej_07{

    public static void main(String[] args) {
        int valores=0;
        int contNegativos=0;
        int contPositivos=0;
        int num=0;

        Scanner entrada = null;
        do{ 
            try{
                entrada = new Scanner(System.in);
                System.out.print("Introduce un valor valido: ");
                num =  entrada.nextInt();
                
                if(num<0)
                    contNegativos++;
                if(num>0)
                    contPositivos++;
                valores++;       
            }
            catch (InputMismatchException excErr){
                entrada.nextLine();
            }
        }
        while(valores<10); // se ha usado 10 en lugar de 100.
        if(contNegativos>0){
            System.out.println("Se han introducido valores negativos. ");
            System.out.println("Se han introducido "+ contNegativos +" numeros negativos.");
            System.out.println("Se han introducido "+ contPositivos +" numeros positivo.");
        }
    }
}

