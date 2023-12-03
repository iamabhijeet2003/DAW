public abstract class Producto implements ImpuestoVenta{
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String imprimirInformacion(){
        return ("Codigo: "+ this.codigo + "\n" + "Nombre :"+ this.nombre + "\n" + "Precio : "+ this.precio + "\n");
    }

    public double calcularImpuesto(){
        return precio * 0.1;
    }
}
