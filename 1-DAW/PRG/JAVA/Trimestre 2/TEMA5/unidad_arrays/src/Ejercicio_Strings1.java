import java.util.Scanner;

public class Ejercicio_Strings1 {
    public static void main(String[] args) {
        
        Scanner entradNombre = new Scanner(System.in);
        System.out.print("Como te llamas? ");
        String nombre = entradNombre.nextLine();

        Scanner entradaSexo = new Scanner(System.in);
        System.out.print("Introduce to sexo(H = hombre, D = Mujer): ");
        String Sexo = entradaSexo.nextLine();

        Scanner entradaTelefono = new Scanner(System.in);
        System.out.print("Introduce tu telefono: ");
        String Telefono = entradaTelefono.nextLine();

        Scanner entradaCiudad = new Scanner((System.in));
        System.out.print("En que ciudad vas a viajar? ");
        String Ciudad = entradaCiudad.nextLine();

        //if(Sexo.charAt(0) == 'H' || Sexo.charAt(0) == 'M'){
            //System.out.println("Hola! Soy la "+ nombre + ". Has llamado al " + Telefono + " y ahora no estoy en casa porque estoy en "+ Ciudad+ " de vacaciones!!!");
            //System.out.println("Hola! Soy el "+ nombre + ". Has llamado al " + Telefono + " y ahora no estoy en casa porque estoy en "+ Ciudad+ " de vacaciones!!!");
        //}
        
        if(Sexo.charAt(0)=='H'){
            System.out.println("Hola! Soy el "+ nombre + ". Has llamado al " + Telefono + " y ahora no estoy en casa porque estoy en "+ Ciudad+ " de vacaciones!!!");
        }
        else if (Sexo.charAt(0)=='D'){
            System.out.println("Hola! Soy la "+ nombre + ". Has llamado al " + Telefono + " y ahora no estoy en casa porque estoy en "+ Ciudad+ " de vacaciones!!!");
        }
        else{
            System.out.println(" ");
        }

    }
}
