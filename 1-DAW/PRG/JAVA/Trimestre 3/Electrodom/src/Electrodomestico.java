public abstract class Electrodomestico {

    private String nombre;
    private String marca;
    private String modelo;
    private double precio;
    private String descripcion;

    public Electrodomestico(String nombre, String marca, String modelo, double precio, String descripcion) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String imprimir(){
        String salida =  this.nombre + " " + this.marca + " " + this.modelo + " \n";
        salida += "precio: " +  this.precio + " Descripción: " + this.descripcion + " \n";
        return salida;
    }

}
