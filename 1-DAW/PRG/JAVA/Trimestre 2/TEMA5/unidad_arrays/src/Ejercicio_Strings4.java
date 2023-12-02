import java.util.Scanner;
//Hacer un programa que, dada una cadena compruebe si aparecen todas las vocales
//(indistintamente mayúsculas o minúsculas).

public class Ejercicio_Strings4 {
    public static void main(String[] args) {
        String frase ="";
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;


        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dame una frase: ");
        frase = entrada.nextLine();

        frase = frase.toLowerCase();
        
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='a'){
               contA+=1;
            }
        }
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='e'){
               contE+=1;
            }
        }
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='i'){
               contI+=1;
            }
        }
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='o'){
               contO+=1;
            }
        }
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='u'){
               contU+=1;
            }
        }


        if(contA>0 && contE>0 && contI>0 && contO>0 && contU>0)
            System.out.println("La frase tiene todas las vocales");
        else    
            System.out.println("La frase no tiene todas las vocales.");
        
    }
}
