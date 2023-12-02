/*
 Realiza un programa que sume independendientemente los números pares y los impares comprendidos entre 100 y 200.
 */

public class Ej_11 {
    public static void main(String[] args) {
        int start=100;
        int stop=200;
        int sumaPares=0;
        int sumaImpares=0;
        for(int i=start;i<=stop;i++){
            if(i%2==0){
                sumaPares+=i;
            }
            if(i%2!=0){
                sumaImpares+=i;
            }

        }
        System.out.println("La suma de los numeros pares entre 100 y 200 es : "+sumaPares);
        System.out.println("La suma de los numeros impares entre 100 y 200 es : "+sumaImpares);   
    }
}
