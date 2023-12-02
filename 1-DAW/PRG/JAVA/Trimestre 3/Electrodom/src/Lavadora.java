public class Lavadora extends ElectrodomesticoBlanco {
    private int rpmCentrifugado;

    public Lavadora(String nombre, String marca, String modelo, double precio,
                    String descripcion, int voltaje, int capacidad,
                    int rpmCentrifugado) {
        super(nombre, marca, modelo, precio, descripcion, voltaje, capacidad);
        this.rpmCentrifugado = rpmCentrifugado;
    }

    @Override
    public String imprimir() {
        String salida =  super.imprimir();
        salida += " rpm de centrifugado: " + this.rpmCentrifugado;
        return salida;
    }
}
