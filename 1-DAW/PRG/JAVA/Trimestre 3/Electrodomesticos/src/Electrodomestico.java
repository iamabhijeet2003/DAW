import java.util.ArrayList;

public abstract class  Electrodomestico {
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

        String salida =  "\n" + "Nombre      : " + this.nombre + "\n" + "Marca       : "+ this.marca + "\n" +  "Modelo      : "+ this.modelo + "\n";
        salida += "Precio      : " + this.precio + " " + "\n" + "Descripcion : " + this.descripcion + "\n";

        return salida ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
