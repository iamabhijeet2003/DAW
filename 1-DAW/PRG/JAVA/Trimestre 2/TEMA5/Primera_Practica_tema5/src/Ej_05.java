import java.util.Scanner;

//Realiza un programa para leer un número positivo N y que calcule y visualice su factorial N!

public class Ej_05 {
    public static void main(String[] args) {
        Scanner teclado = null;
        long fact=1;
        int num;
        do{
            teclado = new Scanner(System.in);
            System.out.print("Dame un numero:");
            num = teclado.nextInt();
        }
        while(num<0);
        
        for(int i=1;i<=num;i++){
            fact= fact*i;
        }
        System.out.println("El factorial de " + num + " es " + fact);
    }
}


