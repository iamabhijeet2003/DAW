public class Computadores extends Producto{
    private int ram;
    private int capacidadAlmacenamiento;

    public Computadores(String codigo, String nombre, double precio, int ram, int capacidadAlmacenamiento) {
        super(codigo, nombre, precio);
        this.ram = ram;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + "RAM : "+ this.ram + "\n" + "Capacidad de Almacenamiento : " + this.capacidadAlmacenamiento + "\n";
    }
}
