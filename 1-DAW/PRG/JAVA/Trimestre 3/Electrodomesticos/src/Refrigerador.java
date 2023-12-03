public class Refrigerador extends ElectrodomesticoBlanco{
    enum tipo{nofrost, frost}
    private tipo tipoEnfriamiento;

    public Refrigerador(String nombre, String marca, String modelo, double precio, String descripcion, int voltage, int capacidad, tipo tipoEnfriamiento) {
        super(nombre, marca, modelo, precio, descripcion, voltage, capacidad);
        this.tipoEnfriamiento = tipoEnfriamiento;
    }

    @Override
    public String imprimir() {
        String salida = super.imprimir();
        salida += "Tipo enfriamiento : " + this.tipoEnfriamiento;

        return salida + "\n";
    }
}
