import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();

        int producto = producto(a, b);
        System.out.printf("El producto de %d y %d es %d", a, b, producto);
    }

    public static int producto(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b == 1) {
            return a;
        } else if (b > 1) {
            return a + producto(a, b-1);
        }
        return b;
    }
}
