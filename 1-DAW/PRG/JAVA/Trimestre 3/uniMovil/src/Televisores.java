public class Televisores extends Producto{
    private  int pulgadas;
    private String resolucion;

    public Televisores(String codigo, String nombre, double precio, int pulgadas, String resolucion) {
        super(codigo, nombre, precio);
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + "Pulgadas: " + this.pulgadas + "\n"
                    + "Resolucion: " + this.resolucion +"\n";
    }
}
