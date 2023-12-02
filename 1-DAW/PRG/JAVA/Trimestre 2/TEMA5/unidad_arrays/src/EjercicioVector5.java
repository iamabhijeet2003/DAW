import java.util.Scanner;

public class EjercicioVector5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un frase:  ");
        String palabra = entrada.nextLine();
        /* 
        for(int i=0; i<palabra.length(); i++) {
            for(char letra ='a'; letra<='z'; letra++) {

                if(palabra.charAt(i) != letra ) {
                    contadorDigitos += 1;
                }else{
                    contadorLetras+=1;
                }
    
            }
            
        }
        if(contadorDigitos>0){
            System.out.println();
        }
        else{
            System.out.println();
        }
        */
        int siEsUnNumero=0;
        String numeros = "0123456789";
        for(int i=0; i<palabra.length(); i++){
            if(palabra.charAt(i) == numeros.charAt(i)){
                siEsUnNumero+=1;
            }
        }

        if(siEsUnNumero>=0){
            System.out.println("la frase tiene numeros");
        }
    }
}
