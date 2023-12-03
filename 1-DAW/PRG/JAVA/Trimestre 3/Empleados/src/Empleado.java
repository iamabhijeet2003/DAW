import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;
    private ArrayList<Tarea> tareas = new ArrayList<>();

    // Constructor y métodos getters y setters
    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public Tarea recuperarTarea(String nomTarea){
        for (Tarea tarea: tareas) {
            if (tarea.getTarea().equals(nomTarea)){
                return tarea;
            }
        }
        return null;
    }

    public int contarTareasCompletadas() {
        int contador = 0;
        for (Tarea tarea : tareas) {
            if (tarea.isTareaCompletada()) {
                contador++;
            }
        }
        return contador;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    // Implementa el método toString() para representar al empleado como una cadena de texto
    @Override
    public String toString(){
        return "Datos del empleado : " + "\n" +
                "     Nombre= " + nombre +  "\n"  +
                "     Edad= " + edad + "\n"+
                "     Sueldo= " + sueldo + "\n" ;
    }
}
