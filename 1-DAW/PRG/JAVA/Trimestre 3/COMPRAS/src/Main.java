public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Cable USB", 9.99);
        Producto producto2 = new Producto("Memoria USB 64gb", 7.99);
        Producto producto3 = new Producto("Cargador USB tipo C", 12.99);
        Producto producto4 = new Producto("Camara Nikon DSLR",379);
        Producto producto5 = new Producto("Objetivo Canon 200c", 275);


        Usuario usuario1 = new Usuario("Pepe Grillo","Calle inextencial S/N",250);
        Usuario usuario2 = new Usuario("David Muñoz","Calle existencial 999",400);

        SistemaComprasImpl procesoCompra = new SistemaComprasImpl();


        System.out.println("\n");
        System.out.println("Agregamos los productos: ");
        System.out.println("------------------------------------");
        procesoCompra.agregarProducto(producto1);
        procesoCompra.agregarProducto(producto2);
        procesoCompra.agregarProducto(producto3);
        procesoCompra.agregarProducto(producto4);
        procesoCompra.agregarProducto(producto5);
        System.out.println("------------------------------------");
        System.out.println();




        //productos disponibles
        System.out.println("Muestro los productos disponibles : ");
        System.out.println("------------------------------------");
        System.out.println("Productos disponibles: ");
        procesoCompra.mostrarProductosDisponibles(procesoCompra.getProductosDisponibles());
        System.out.println("------------------------------------");
        System.out.println();


        //// Validar existencia de un producto en el sistema

        boolean existeProducto1 = procesoCompra.validarExistenciaProducto(producto1);
        boolean existeProducto4 = procesoCompra.validarExistenciaProducto(new Producto("Dron DJI",1000));
        System.out.println("Compruebamos los productos disponibles : ");
        System.out.println("------------------------------------");

        System.out.println("Producto 1 existe en el sistema? " + (existeProducto1 ? "Si, existe el producto." : "No, este producto no existe"));
        System.out.println("Producto 4 existe en el sistema? " + (existeProducto4 ? "Si, existe el producto." : "No, este producto no existe"));

        System.out.println("------------------------------------");
        System.out.println();


        //agrego productos al carrito
        System.out.println("Agrego los productos al carrito del Usuario : ");
        System.out.println("------------------------------------");
        usuario1.agregarProductoAlCarrito(producto1,3);
        usuario1.agregarProductoAlCarrito(producto3,10);


        usuario2.agregarProductoAlCarrito(producto4,2);
        System.out.println("------------------------------------");
        System.out.println();


        // Calcular total del carrito del usuario
        System.out.println("Calculo el total del carrito del Usuario : ");
        System.out.println("------------------------------------");
        System.out.println("\n");
        double totalCarrito1 = procesoCompra.calcularTotal(usuario1);
        System.out.println("El total del carrito del "+ usuario1.getNombre() + " es " + totalCarrito1);

        double totalCarrito2 = procesoCompra.calcularTotal(usuario2);
        System.out.println("El total del carrito del "+ usuario2.getNombre() + " es " + totalCarrito2);
        System.out.println("------------------------------------");
        System.out.println();



        //realizamos la compra:
        System.out.println("Realizamos la accion de compra : ");
        System.out.println("------------------------------------");
        System.out.println("\n");

        System.out.println("Esta será la compra para " + usuario1.getNombre() );
        procesoCompra.realizarCompra(usuario1);
        System.out.println();

        System.out.println("Esta será la compra para " + usuario2.getNombre() );
        procesoCompra.realizarCompra(usuario2);
        System.out.println("------------------------------------");


    }
}