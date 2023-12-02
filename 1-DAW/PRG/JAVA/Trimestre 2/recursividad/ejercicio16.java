//Implementa una función recursiva que calcule el término n-esimo de la sucesión de Fibonacci.
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el término n-ésimo de la sucesión de Fibonacci que deseas calcular: ");
        int n = sc.nextInt();

        int resultado = fibonacci(n);

        System.out.printf("El término n-ésimo de la sucesión de Fibonacci es: %d%n", resultado);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
