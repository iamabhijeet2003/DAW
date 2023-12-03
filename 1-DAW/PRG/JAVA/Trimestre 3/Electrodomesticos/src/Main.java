import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static ArrayList<Electrodomestico> Almacen = new ArrayList<>();
    public static void main(String[] args) {
    Refrigerador neveraAEG = new Refrigerador("Nevera LG", "LG", "1243",
                                        1234.34,"Nevera Americana", 12,
                                     120, Refrigerador.tipo.frost);

    Lavadora lavadoraAEG = new Lavadora("Lavadora Bosch","Bosch","123",
                                        330,"Lavadora Inglesa", 223, 330, 1234);

    Televisor televisorAEG = new Televisor("TV Samsung","AEG","321",
                                            680.99,"Televisor UltraHd", 55.5,"Qled 8K");
    neveraAEG.agregar(Almacen);
    lavadoraAEG.agregar(Almacen);
    televisorAEG.agregar(Almacen);

        for (Electrodomestico elec: Almacen) {
            System.out.println(elec.imprimir());
            System.out.println("------------------------------");
        }
    operacionUsuario();


    }

    public static void operacionUsuario(){
        /*   //no me sirvia pedir datos aqui porque a la hora de eliminar o buscar tengoo que preguntar otra vez lo mismo.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los datos del electrodoméstico:");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Marca: ");
        String marca = entrada.nextLine();
        System.out.print("Modelo: ");
        String modelo = entrada.nextLine();
        System.out.print("Precio: ");
        double precio = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Descripción: ");
        String descripcion = entrada.nextLine();

         */
        Scanner entrada = new Scanner(System.in);
        int numOperacion;
        System.out.println("¿Qué operación quieres realizar?");
        System.out.println("1. Agregar electrodoméstico");
        System.out.println("2. Eliminar electrodoméstico");
        System.out.println("3. Buscar electrodoméstico");
        System.out.print("Ingrese el número de la operación: ");
        numOperacion = entrada.nextInt();
        entrada.nextLine();

        switch (numOperacion){
            case 1: //agregar
                //pido los datos

                System.out.println("Ingrese los datos del electrodoméstico:");
                System.out.print("Nombre: ");
                String nombre = entrada.nextLine();
                System.out.print("Marca: ");
                String marca = entrada.nextLine();
                System.out.print("Modelo: ");
                String modelo = entrada.nextLine();
                System.out.print("Precio: ");
                double precio = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Descripción: ");
                String descripcion = entrada.nextLine();


                System.out.println("¿Qué tipo de electrodoméstico quieres agregar?");
                System.out.println("1. Lavadora");
                System.out.println("2. Refrigerador");
                System.out.println("3. Televisor");
                System.out.print("Ingrese el número del tipo de electrodoméstico: ");
                int tipoElectrodomestico = entrada.nextInt();
                entrada.nextLine();
                switch (tipoElectrodomestico){
                    case 1://LAVADORA
                        System.out.println("Ingrese los datos específicos de la lavadora: ");
                        int voltageLavadora;
                        int capacidadLavadora;
                        int rpm;
                        System.out.println("Introduce el voltage de la lavadora: ");
                        voltageLavadora = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("Introduce la capacidad de la lavadora: ");
                        capacidadLavadora = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("Introduce las revoluciones por minute de lavadora");
                        rpm = entrada.nextInt();
                        entrada.nextLine();

                        Lavadora lavadora = new Lavadora(nombre,marca,modelo,precio,descripcion,voltageLavadora,capacidadLavadora,rpm);
                        lavadora.agregar(Almacen);
                        System.out.println("Lavadora Agregada Correctamente");
                        /*
                        for (Electrodomestico elec: Almacen) {
                            System.out.println(elec.imprimir());
                            System.out.println("------------------------------");
                        }

                         */
                        break;

                    case 2://NEVERA
                        System.out.println("Ingrese los datos específicos de la nevera: ");
                        int voltageNevera;
                        int capacidadNevera;
                        System.out.println("Introduce el voltage de la nevera: ");
                        voltageNevera = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("Introduce la capacidad de la nevera: ");
                        capacidadNevera = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("Introduce el tipo de enfriamiento de la nevera");
                        System.out.println("1. Frost");
                        System.out.println("2. No Frost");
                        System.out.print("Ingrese el número del tipo de enfriamiento: ");
                        int tipoEnfriamiento = entrada.nextInt();
                        Refrigerador.tipo tipo = null;
                        switch (tipoEnfriamiento) {
                            case 1:
                                tipo = Refrigerador.tipo.frost;
                                break;
                            case 2:
                                tipo = Refrigerador.tipo.nofrost;
                                break;
                        }


                        Refrigerador refrigerador1 = new Refrigerador(nombre,marca,modelo,precio,descripcion,
                                                    voltageNevera,capacidadNevera,tipo);
                        refrigerador1.agregar(Almacen);
                        System.out.println("Refrigerador agregado Correctamente.");
                        /*
                        for (Electrodomestico elec: Almacen) {
                            System.out.println(elec.imprimir());
                            System.out.println("------------------------------");
                        }

                         */
                        break;

                    case 3://TELEVISON
                        System.out.println("Ingrese los datos específicos de la Television: ");
                        double pulgadas;
                        String resolucion;
                        System.out.println("Introduce las pulgadas de la television: ");
                        pulgadas = entrada.nextDouble();
                        entrada.nextLine();

                        System.out.println("Introduce la resulucion de la television: ");
                        resolucion = entrada.next();
                        entrada.nextLine();

                        Televisor televison = new Televisor(nombre,marca,modelo,precio,descripcion,pulgadas,resolucion);
                        televison.agregar(Almacen);
                        System.out.println("Televisor Agregado Correctamente") ;
                        /*
                        for (Electrodomestico elec: Almacen) {
                            System.out.println(elec.imprimir());
                            System.out.println("------------------------------");
                        }

                         */
                        break;
                }
                    for (Electrodomestico elec: Almacen) {
                        System.out.println(elec.imprimir());
                        System.out.println("------------------------------");
                    }
            break;
            case 2: // eliminar
                /*
                System.out.println("Ingrese los datos del electrodomestico a eliminar:");
                System.out.print("Nombre: ");
                String nombreEliminar = entrada.next();
                System.out.println("Marca: ");
                String marcaEliminar = entrada.next();
                System.out.println("Modelo: ");
                String modeloEliminar = entrada.next();

                // Busco el electrodoméstico en el ArrayList

                Electrodomestico electrodomesticoEliminar = null;
                for (Electrodomestico elec : Almacen) {
                    if (elec.getNombre().equals(nombreEliminar) && elec.getMarca().equals(marcaEliminar) && elec.getModelo().equals(modeloEliminar)) {
                        electrodomesticoEliminar = elec;
                        break;
                    }
                }
                // Si encuentro el electrodoméstico, lo eliminamos del ArrayList
                if (electrodomesticoEliminar != null) {
                    Almacen.remove(electrodomesticoEliminar);
                    System.out.println("Electrodomestico eliminado exitosamente");
                    for (Electrodomestico elec: Almacen) {
                        System.out.println(elec.imprimir());
                        System.out.println("------------------------------");
                    }
                } else {
                    System.out.println("No se encontro un electrodomestico con los datos ingresados");
                }
                break;

                 */
                Scanner eliminarScanner = new Scanner(System.in);
                System.out.println("Ingrese el nombre del electrodoméstico a eliminar:");
                String nombreEliminar = eliminarScanner.nextLine();
                boolean eliminado = false;
                for (int i = 0; i < Almacen.size(); i++){
                    Electrodomestico electrodomestico = Almacen.get(i);
                    if (electrodomestico.getNombre().equalsIgnoreCase(nombreEliminar)) {
                        Almacen.remove(i);
                        eliminado = true;
                        System.out.println("El electrodoméstico ha sido eliminado exitosamente");
                        break;
                    }
                }
                for (Electrodomestico elec: Almacen) {
                    System.out.println(elec.imprimir());
                    System.out.println("------------------------------");
                }
                break;
            case 3://buscar
                // Peido al usuario el criterio de búsqueda
                System.out.println("Introduce el criterio de búsqueda:");
                System.out.println("1. Nombre");
                System.out.println("2. Marca");
                System.out.print(">> ");
                int criterio = entrada.nextInt();
                entrada.nextLine();

                // Pido al usuario el valor del criterio de búsqueda
                System.out.print("Introduce el electrodomestico que quieres buscar : ");
                String valor = entrada.nextLine();

                // Buscar electrodomésticos según el criterio de búsqueda
                ArrayList<Electrodomestico> resultados = new ArrayList<>();
                for (Electrodomestico elec : Almacen) {
                    if (criterio == 1 && elec.getNombre().equalsIgnoreCase(valor)) {
                        resultados.add(elec);
                    } else if (criterio == 2 && elec.getMarca().equalsIgnoreCase(valor)) {
                        resultados.add(elec);
                    }
                }

                // Mostrar los resultados de la búsqueda
                if (resultados.isEmpty()) {
                    System.out.println("No se encontraron resultados para el criterio de búsqueda.");
                } else {
                    System.out.println("Resultados de la búsqueda:");
                    for (Electrodomestico elec : resultados) {
                        System.out.println(elec.imprimir());
                        System.out.println("------------------------------");
                    }
                }
                break;
        }

    }
}
