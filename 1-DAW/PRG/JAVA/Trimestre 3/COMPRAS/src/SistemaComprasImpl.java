import java.util.ArrayList;

public class SistemaComprasImpl implements SistemaCompras{
    private ArrayList<Producto> productosDisponibles = new ArrayList<>();


    @Override
    public void agregarProducto(Producto producto) {
        productosDisponibles.add(producto);
        System.out.println("Producto agregado : " + producto.getNombre());
    }


    @Override
    public void eliminarProducto(Producto producto) {
        productosDisponibles.remove(producto);
        System.out.println("Producto eliminado: " + producto.getNombre());
    }



    @Override
    public double calcularTotal(Usuario usuario) {
        double total = 0.0;
        for (ProductoCantidad productoCantidad : usuario.getProductosEnCarrito()) {
            Producto producto = productoCantidad.getProducto();
            int cantidad = productoCantidad.getCantidad();
            total += producto.getPrecio() * cantidad;
        }
        return total;
    }


    @Override
    public void realizarCompra(Usuario usuario) {
        double total = calcularTotal(usuario);
        if (usuario.getSaldo() >= total) {
            usuario.setSaldo(usuario.getSaldo() - total);
            System.out.println("Compra realizada por " + usuario.getNombre() + " por un total de " + total);
            System.out.println("El saldo restante despues de la compra es " + usuario.getSaldo());

            usuario.vaciarCarrito();// Vaciar el carrito después de la compra
        } else {
            System.out.println("No se ha podido realizar la compra");
            System.out.println("Motivo : Saldo insuficiente.");
            System.out.println("El saldo que tienes disponible es : " + usuario.getSaldo() +
                    " y el importe de su carrito es " + calcularTotal(usuario) );
        }
    }

    @Override
    public void mostrarProductosDisponibles(ArrayList<Producto> productosDisponibles) {
        for (Producto p : productosDisponibles) {
            System.out.println(p.toString());
        }
    }


    @Override
    public boolean validarExistenciaProducto(Producto producto) {
        for (Producto p: productosDisponibles) {
            if (p.equals(producto)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Producto> getProductosDisponibles() {
        return productosDisponibles;
    }


}
