import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String direccion;
    private double saldo;
    private ArrayList<ProductoCantidad> productosEnCarrito = new ArrayList<>();
    public Usuario(String nombre, String direccion, double saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public void vaciarCarrito(){
        productosEnCarrito.clear();
        System.out.println("Además, despues de esta compra se ha vaciado su carrito.");
    }


    public void agregarProductoAlCarrito(Producto producto, int cantidad) {
        ProductoCantidad productoCantidad = new ProductoCantidad(producto, cantidad);
        productosEnCarrito.add(productoCantidad);
        System.out.println("Producto : " + "\" " +producto.getNombre()+ " \" " + " agregado existosamente al carrito de " + this.getNombre() + " ( Cantidad de producto : " + cantidad + ")");
    }





    @Override
    public String toString() {
        return "Usuario : " + "\n" + "     Nombre= " + nombre +  "\n"  +"     Direcccion = " + direccion + "\n" +"     Saldo = " + saldo + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<ProductoCantidad> getProductosEnCarrito() {
        return productosEnCarrito;
    }
    
}
