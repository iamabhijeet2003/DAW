import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        Solar solar1 = new Solar("12345",1400,40000, Solar.tipo.suelo_Residencial,
                                    2015,false);
        solar1.agregar(inmuebles);
        Solar solar2 = new Solar("23456",1500,50000, Solar.tipo.suelo_Industrial,
                                2022,true );
        solar2.agregar(inmuebles);
        Vivienda vivienda1 = new Vivienda("124523",70,65000,2,1,
                                    Vivienda.estado.para_reformar);
        vivienda1.agregar(inmuebles);
        Vivienda vivienda2 = new Vivienda("876234",120,123000,4,2,
                                    Vivienda.estado.obra_nueva);
        vivienda2.agregar(inmuebles);
        Vivienda vivienda3 = new Vivienda("096t5rty",85,134000,4,2,
                                    Vivienda.estado.buen_estado);
        vivienda3.agregar(inmuebles);
        Terrenos terreno1 = new Terrenos("12345421",13000,24000, Terrenos.tipo.Secano,
                        false,false);
        terreno1.agregar(inmuebles);
        Terrenos terreno2 = new Terrenos("kjwgh233",45000,170000, Terrenos.tipo.Regadio,
                            true,true);
        terreno2.agregar(inmuebles);



        for (Inmueble inmueble: inmuebles) {
            System.out.println(inmueble.imprimirInformacion());
            System.out.println("------------------------------------");
        }

        Alquiler alquiler1 = new Alquiler(440,new Date(2023,12,12),new Date(2024,12,12));
        alquiler1.registrarPago(440,"12-01-2023");
        alquiler1.registrarPago(440,"12-02-2023");

        alquiler1.imprimirResumenAlquiler();

    }


}