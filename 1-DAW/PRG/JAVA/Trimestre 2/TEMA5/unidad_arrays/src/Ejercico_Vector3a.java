import java.util.Scanner;

/*
    Haz un programa que pida un número de entre 5 y 10 cifras. Después comprobará si el número es palíndromo:
        Sin usar vectores.
 */
public class Ejercico_Vector3a {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = entrada.nextInt();
        int temp = num;
        int rev = 0;

        while(temp!=0){
            rev = rev * 10 + temp % 10;
            temp = temp/10;
        }
        if(num==rev){
            System.out.println("El numero "+ num + " es Palindromo");
        }else{ 
            System.out.println("El numero "+ num +" no es Palindromo");
        } 
    }
}
