public class Lavadora extends ElectrodomesticoBlanco{
    private int rpm;

    public Lavadora(String nombre, String marca, String modelo, double precio, String descripcion, int voltage, int capacidad, int rpm) {
        super(nombre, marca, modelo, precio, descripcion, voltage, capacidad);
        this.rpm = rpm;
    }

    @Override
    public String imprimir() {
        String salida = super.imprimir();
        salida += "RPM         : " + this.rpm;

        return salida + "\n";
    }
}
