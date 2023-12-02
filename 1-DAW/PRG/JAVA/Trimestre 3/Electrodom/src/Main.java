import java.util.ArrayList;

public class Main {

    static ArrayList<Electrodomestico> Almacen = new ArrayList<>();
    public static void main(String[] args) {

        Frigo neveraAEG = new Frigo("AEGNevera","AEG",
                "AEGFrost",540.44,
                "Nevera americana",220,330, Frigo.tipo.frost);
        Lavadora lavadoraAEG = new Lavadora("AEGLavadora","AEG",
                "AEGLavamat",800.44,
                "Lavadora automática",220,8, 1200);


        neveraAEG.agregar(Almacen);
        lavadoraAEG.agregar(Almacen);

        for (Electrodomestico elec: Almacen) {
            System.out.println(elec.imprimir());
            System.out.println("-------------");
        }

        //lavadoraAEG.eliminar(Almacen);

        Electrodomestico ventaLavadora = lavadoraAEG.buscar(Almacen);
        System.out.println(lavadoraAEG.getClass());
    }
}