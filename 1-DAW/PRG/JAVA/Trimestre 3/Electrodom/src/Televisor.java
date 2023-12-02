public class Televisor extends Electrodomestico{
    private double pulgadas;
    private String resolucion;

    public Televisor(String nombre, String marca, String modelo, double precio, String descripcion, double pulgadas, String resolucion) {
        super(nombre, marca, modelo, precio, descripcion);
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }
}
