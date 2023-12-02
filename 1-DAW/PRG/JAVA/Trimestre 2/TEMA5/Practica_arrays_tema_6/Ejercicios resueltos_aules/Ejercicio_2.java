public class Ejercicio_2 {
    public static void main(String[] args) {
        int[] edades = new int[10];
        int alumno;
        int suma = 0;
        
        for (int i = 0; i < edades.length; i++) {
            edades[i] = Leer.leerEntero("Dime tu edad ");
        }

        do {
            alumno = Leer.leerEntero("Dime el número de lista del alumno del que quieres saber la edad (0,"+(edades.length-1)+")");
        } while(alumno < 0 || alumno >= edades.length);

        System.out.println("La edad del alumno solicitado es "+edades[alumno]);

        do {
            alumno = Leer.leerEntero("Dime el número de edades que quieres sumar (0,"+(edades.length-1)+")");
        } while(alumno < 0 || alumno >= edades.length);

        for (int i = 0; i < alumno; i++) {
            suma += edades[i];
        }

        System.out.println("Las edades de los "  + alumno + " primeros alumnos, suma " + suma);
    }
}
