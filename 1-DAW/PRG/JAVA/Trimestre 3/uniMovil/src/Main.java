public class Main {
    public static void main(String[] args) {
        Televisores tv1 = new Televisores("123","Tele Samsung", 330, 55, "HD");
        Computadores pc1 = new Computadores("124","Samsung pc", 600, 8096, 2048);
        Telefono movil1 = new Telefono("124","Samsung galaxy s22 ulta", 600, 10, 124);


        System.out.println(tv1.imprimirInformacion());
        System.out.println(tv1.calcularImpuesto());

        System.out.println(pc1.imprimirInformacion());
        System.out.println(pc1.calcularImpuesto());

        System.out.println(movil1.imprimirInformacion());
        System.out.println(movil1.calcularImpuesto());

        Reparaciones reparacion1 = new Reparaciones(12,10);
        System.out.println(reparacion1.imprimirReparacion());

    }
}