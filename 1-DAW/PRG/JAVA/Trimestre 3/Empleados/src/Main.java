public class Main {
    public static void main(String[] args) {
        //instancio el objeto
        SistemaEmpleadosImpl sistemaEmpleados = new SistemaEmpleadosImpl();

        //creo los empleados
        sistemaEmpleados.crearEmpleados();
        System.out.println("\n");


        //voy a listar los empleados
        System.out.println("Lista de empleados:");
        System.out.println("--------------------------------------");
        sistemaEmpleados.listarEmpleados();
        System.out.println("--------------------------------------");


        // Asigno tareas a los empleados
        /*
        sistemaEmpleados.asignarTarea(empleado1, "Realizar informes");
        System.out.println("Tarea \""+ empleado1.recuperarTarea("Realizar informes").getTarea() +  "\" asignada a " + empleado1.getNombre());
        System.out.println();

        sistemaEmpleados.asignarTarea(empleado2,"Ganar f1");
        System.out.println("Tarea \""+ empleado2.recuperarTarea("Ganar f1").getTarea() +  " \"asignada a " + empleado2.getNombre());
        System.out.println();

        sistemaEmpleados.asignarTarea(empleado3,"Dejar VOX");
        System.out.println("Tarea \""+ empleado3.recuperarTarea("Dejar VOX").getTarea() +  "\" asignada a " + empleado3.getNombre());
        System.out.println();

        sistemaEmpleados.asignarTarea(empleado4,"Luchar para la IGUALDAD");
        System.out.println("Tarea \""+ empleado4.recuperarTarea("Luchar para la IGUALDAD").getTarea() +  "\" asignada a " + empleado4.getNombre());
        System.out.println();

        System.out.println();
        System.out.println("--------------------------------------");

         */
        sistemaEmpleados.asignarTareas();



        /*

        // Completar tarea asignada a un empleado
        sistemaEmpleados.completarTarea(empleado1, empleado1.getTareas().get(0).getTarea());
        System.out.println("Tarea completada por " + empleado1.getNombre());
        System.out.println();

        sistemaEmpleados.completarTarea(empleado2, empleado2.getTareas().get(0).getTarea());
        System.out.println("Tarea completada por " + empleado2.getNombre());
        System.out.println("--------------------------------------");

         */
        sistemaEmpleados.completarTarea();

        // elimino empleado 3



        /*
        sistemaEmpleados.eliminarEmpleado(empleado3);

        System.out.println();
        System.out.println("--------------------------------------");
        //muestro las estadisticas

        sistemaEmpleados.mostrarEstadisticas();
        System.out.println();
        System.out.println("--------------------------------------");
        //calcular sueldo medio


        double sueldoMedio = sistemaEmpleados.calcularSueldoPromedio();

        System.out.println(sueldoMedio);
        System.out.println();
        System.out.println("--------------------------------------");

         */
        /*
        el suedo promedio me sale de 2666.6666666666665 porque elimino el empleado3 : santiago abascal.
        entonces, quedan 3 empleados:
                        sueldo de empleado 1 : 1200
                        sueldo de empleado 2 : 1500
                        sueldo de empleado 4 : 5300
                                    ----------------
                                      total =  8000
                                      8000/3 = 2666.6666666666665

         */

    }
}