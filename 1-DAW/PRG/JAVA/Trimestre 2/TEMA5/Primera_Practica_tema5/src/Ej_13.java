/*
 * Realiza un programa donde el usuario piensa un número del 1 al 100 y el ordenador lo adivina.
 * El usuario debe indicarle al ordenador si es mayor, menor o igual.
 */
import java.util.Scanner;

public class Ej_13 {
    static class EntradaNoValida extends Exception{
        public EntradaNoValida(String message) {
            super(message);
        }
    }
    public static void main(String[] args) throws Ej_13.EntradaNoValida {
        String valor="";
        Scanner entrada = null;
        int min = 1;
        int max = 100;
        int num = max/2;
        do {
            try{
                entrada = new Scanner(System.in);
                System.out.println("El numero que has pensdo es el " + num);
                System.out.println("Introduce si el numero es mayor, menor o acertado");
                valor = entrada.nextLine();

                if (!valor.equals("mayor") && !valor.equals("menor") && !valor.equals("acertado"))
                    throw new EntradaNoValida("Debe introducir [mayor], [menor]o [acertado]");
                // if (valor.equals("mayor"))
                //     min = num;
                // if (valor.equals("menor"))
                //     max = num;
                num = min+(max-min)/2;
            }
            catch (EntradaNoValida exc) {
                while (!valor.equals("mayor") && !valor.equals("menor") && !valor.equals("acertado")) {
                    System.out.println(exc.getMessage());
                    valor = entrada.nextLine();
                }
                if (valor.equals("mayor"))
                    min = num;
                if (valor.equals("menor"))
                    max = num;
                num = min+(max-min)/2;
            }
        }while (!valor.equals("acertado"));
    }
}
