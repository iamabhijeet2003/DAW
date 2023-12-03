import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.SortedMap;

public class SistemaEmpleadosImpl implements SistemaEmpleados{
    private ArrayList<Empleado> empleados = new ArrayList<>();

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println(" - Empleado \"" + empleado.getNombre() + "\" agregado correctamente.");
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
        System.out.println(" - Empleado \"" + empleado.getNombre() + "\" se ha eliminado correctamente.");
    }

    @Override
    public void asignarTarea(Empleado empleado, String tarea) {
        Tarea tarea1 = new Tarea(tarea, false);
        empleado.getTareas().add(tarea1);
    }


    @Override
    public void completarTarea(Empleado empleado, String tarea) {
        for (Tarea t : empleado.getTareas()) {
            if (t.getTarea().equals(tarea)) {
                t.setTareaCompletada(true);
                return;
            }
        }
    }


    @Override
    public void listarEmpleados() {
        for (Empleado empleado:empleados) {
            System.out.println(empleado.toString());
        }
    }

    @Override
    public void mostrarEstadisticas() {
        int totalEmpleados = empleados.size();
        int empleadosConTareasCompletadas = 0;

        for (Empleado empleado : empleados) {
            if (empleado.contarTareasCompletadas() > 0) {
                empleadosConTareasCompletadas++;
            }
        }

        System.out.println("Estadísticas de los empleados:");
        System.out.println("Total de empleados: " + totalEmpleados);
        System.out.println("Empleados con tareas completadas: " + empleadosConTareasCompletadas);
    }

    @Override
    public double calcularSueldoPromedio() {
        double sumaSueldos = 0;
        int totalEmpleados = empleados.size();
        System.out.println("El numero total de empleados es: " + totalEmpleados);

        for (Empleado empleado : empleados) {
            sumaSueldos += empleado.getSueldo();
        }

        System.out.println("La suma de los sueldos de los empleados es: "+ sumaSueldos);
        System.out.print("Por lo tanto el sueldo promedio sería " + sumaSueldos + " ÷ " +  totalEmpleados + " : ");

        if (totalEmpleados > 0) {
            return  (sumaSueldos / totalEmpleados);
        } else {
            return 0; // Si no hay empleados, el sueldo promedio es 0
        }
    }

    public void crearEmpleados(){
        Empleado empleado1 = new Empleado("David Amoros Sendra",31,1200);
        Empleado empleado2 = new Empleado("Fernando Alonso",33,1500);
        Empleado empleado3 = new Empleado("Santiago Abascal",44,1800);
        Empleado empleado4 = new Empleado("Irene Montero",34,5300);

        agregarEmpleado(empleado1);
        agregarEmpleado(empleado2);
        agregarEmpleado(empleado3);
        agregarEmpleado(empleado4);
    }

    public void asignarTareas(){
        for (Empleado empleado: empleados){
            if (empleado.getNombre().equals("David Amoros Sendra")){
                asignarTarea(empleado,"Realizar informes");
                System.out.println("Tarea \"" + empleado.recuperarTarea("Realizar informes").getTarea() + "\" asignada a " + empleado.getNombre());
            }else if (empleado.getNombre().equals("Fernando Alonso")) {
                asignarTarea(empleado, "Ganar f1");
                System.out.println("Tarea \"" + empleado.recuperarTarea("Ganar f1").getTarea() + "\" asignada a " + empleado.getNombre());
            }else if (empleado.getNombre().equals("Santiago Abascal")) {
                asignarTarea(empleado, "Dejar VOX");
                System.out.println("Tarea \"" + empleado.recuperarTarea("Dejar VOX").getTarea() + "\" asignada a " + empleado.getNombre());
            } else if (empleado.getNombre().equals("Irene Montero")) {
                asignarTarea(empleado, "Luchar para la IGUALDAD");
                System.out.println("Tarea \"" + empleado.recuperarTarea("Luchar para la IGUALDAD").getTarea() + "\" asignada a " + empleado.getNombre());
            }
            System.out.println();
            System.out.println("--------------------------------------");

        }
    }

    public void completarTarea() {
        for (Empleado empleado : empleados) {
            if (!empleado.getTareas().isEmpty()) {
                Tarea tarea = empleado.getTareas().get(0);
                completarTarea(empleado, tarea.getTarea());
                System.out.println("Tarea completada por " + empleado.getNombre());
                System.out.println();
            }
        }
        System.out.println("--------------------------------------");
    }






}
