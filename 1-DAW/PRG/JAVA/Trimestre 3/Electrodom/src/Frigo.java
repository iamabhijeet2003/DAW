public class Frigo extends ElectrodomesticoBlanco{
    enum tipo {nofrost,frost}

    private tipo tipoEnfriamiento;

    public Frigo(String nombre, String marca, String modelo, double precio,
                 String descripcion, int voltaje, int capacidad,
                 tipo tipoEnfriamiento) {
        super(nombre, marca, modelo, precio, descripcion, voltaje, capacidad);
        this.tipoEnfriamiento = tipoEnfriamiento;
    }

    @Override
    public String imprimir() {
        String salida = super.imprimir();
        salida += this.tipoEnfriamiento.toString();
        return salida;
    }
}
