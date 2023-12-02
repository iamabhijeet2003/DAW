public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto : " + "\n" +
                "     Nombre= " + nombre +  "\n"  +
                "     Precio= " + precio + "\n" ;
    }
    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }

}
