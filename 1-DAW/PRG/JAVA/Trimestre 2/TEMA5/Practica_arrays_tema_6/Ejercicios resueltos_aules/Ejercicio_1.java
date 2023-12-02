public class Ejercicio_1 {
    public static void main(String[] args) {
        int[] vector = new int[5];

        /* También podriamos hacerlo en dos partes
            int[] vector:
            vector = new int[5];
        */

        System.out.println("Valors inicials per defecte");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] = 3;
        }

        System.out.println("Valors després d'inicialitzar el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        int memoriaVector = Integer.SIZE/8*vector.length;
        System.out.println("EL vector ocupa " + memoriaVector + " bytes de memoria");
    }
}
