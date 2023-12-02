import java.util.ArrayList;

public interface SistemaCompras {
    void agregarProducto(Producto producto);
    void eliminarProducto(Producto producto);
    void realizarCompra(Usuario usuario);
    double calcularTotal(Usuario usuario);
    default void mostrarProductosDisponibles(ArrayList<Producto> productosDisponibles) {
        // Implementación para mostrar los productos disponibles en el sistema


    }
    default boolean validarExistenciaProducto(Producto producto) {
        // Implementación para validar la existencia de un producto en el sistema
        return false;
    }


}
