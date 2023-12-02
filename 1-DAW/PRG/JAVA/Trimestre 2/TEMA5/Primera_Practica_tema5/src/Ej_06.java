import java.util.InputMismatchException;
import java.util.Scanner;
//Realiza un programa para leer 100 números no nulos y que visualice un mensaje de si ha leído algún número negativo o no.
public class Ej_06 {
    public static void main(String[] args) {
        int valores=0;
        int contNegativos=0;
        int num=0;

        Scanner entrada= null;
        do{ 
            try{
                entrada = new Scanner(System.in);
                System.out.print("Introduce un valor valido: ");
                num =  entrada.nextInt();
                
                if(num<0)
                    contNegativos++;
                valores++;
            }
            catch (InputMismatchException excErr){
                entrada.nextLine();
            }
            

        }
        while(valores<10); //se han usado 10 en lugar de 100.
        if(contNegativos>0){
            System.out.println("Se han introducido valores negativos. ");
        }

    }
}
