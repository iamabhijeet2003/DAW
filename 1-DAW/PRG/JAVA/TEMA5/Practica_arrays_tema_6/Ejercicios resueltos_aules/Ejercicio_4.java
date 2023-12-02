public class Ejercicio_4 {
    public static void main(String[] args) {
        final int ALUMNOS = 2;
        int[] expediente = new int[ALUMNOS];
        float[] nota = new float[ALUMNOS];
        int[] edad = new int[ALUMNOS];

        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("Dame los datos del alumno " + i);
            expediente[i] = Leer.leerEntero("Dime el número de expediente: ");
            nota[i] = Leer.leerFloat("Dime la nota: ");
            edad[i] = Leer.leerEntero("Dime la edad: ");
        }

        System.out.println("======  ==========  ====  ====");
        System.out.println("Número  Expediente  Nota  Edad");
        System.out.println("======  ==========  ====  ====");
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.printf("%6d  %10d  %4.1f  %4d\n",i,expediente[i],nota[i],edad[i]);
        }

        int exp = Leer.leerEntero("Dime el número de expediente: ");
        for(int i = 1; i < ALUMNOS; i++){
            if(exp == expediente[i]) {
                System.out.printf("El expediente %3d ha sacado un %4.1f y tiene %2d años",expediente[i],nota[i],edad[i]);
                break;
            }
        }
        
    }
}
