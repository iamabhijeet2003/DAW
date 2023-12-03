import java.util.ArrayList;

public interface SistemaEmpleados {
    void agregarEmpleado(Empleado empleado);
    void eliminarEmpleado(Empleado empleado);
    void asignarTarea(Empleado empleado, String tarea);
    void completarTarea(Empleado empleado, String tarea);
    void listarEmpleados();
    default void mostrarEstadisticas() {
        // Implementación para mostrar estadísticas de los empleados

    }
    default double calcularSueldoPromedio() {

        return 0;
    }
}