public class Telefono extends Producto{
    private int duracionBateria;
    private  int mpCamara;

    public Telefono(String codigo, String nombre, double precio, int duracionBateria, int mpCamara) {
        super(codigo, nombre, precio);
        this.duracionBateria = duracionBateria;
        this.mpCamara = mpCamara;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public int getMpCamara() {
        return mpCamara;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + "Duracion de Bateria: " + this.duracionBateria + "\n" + "Megapixeles de Camara : "+ this.mpCamara + "\n";
    }
}
