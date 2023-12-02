public class Ejercicio_3 {
    public static void main(String[] args) {
        int[] origen = {15,22,55,67,33,46,26,54,21,4};
        int[] destino = new int[origen.length];
        int j = 0;

        for (int i = 0; i < origen.length; i++) {
            if(origen[i] % 2 == 0 && origen[i] > 30) {
                destino[j++] = origen[i];
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.printf("destino[%d] = %d\n",i,destino[i]);
        }
    }
}
