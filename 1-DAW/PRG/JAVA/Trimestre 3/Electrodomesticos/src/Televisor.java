import java.util.ArrayList;

public class Televisor extends Electrodomestico{
    private double pulgadas;
    private String resolucion;

    public Televisor(String nombre, String marca, String modelo, double precio, String descripcion, double pulgadas, String resolucion) {
        super(nombre, marca, modelo, precio, descripcion);
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }

    public void agregar (ArrayList<Electrodomestico> almacen){
        almacen.add(this);
    }

    @Override
    public String imprimir() {
        String salida = super.imprimir();
        salida += "Pulagadas   : " + this.pulgadas + "\n" + "Resolución  : " + this.resolucion + "\n";
        return salida + "\n";
    }
}
