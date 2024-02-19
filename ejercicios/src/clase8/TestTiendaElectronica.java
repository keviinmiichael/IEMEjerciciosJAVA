package clase8;

public class TestTiendaElectronica {
    public static void main(String[] args) {
        // Crear instancias de productos
        Producto laptop = new Producto("Laptop", 800.0, 10);
        Producto telefono = new Producto("Teléfono", 300.0, 20);

        // Crear instancias de clientes
        Cliente cliente1 = new Cliente("Carlos", 25, 1000.0);
        Cliente cliente2 = new Cliente("Ana", 30, 1500.0);

        // Crear instancia de la tienda
        TiendaElectronica tienda = new TiendaElectronica();

        // Agregar productos y clientes a la tienda
        System.out.println();
        tienda.agregarProducto(laptop);
        System.out.println();
        tienda.agregarProducto(telefono);
        System.out.println();
        tienda.registrarCliente(cliente1);
        System.out.println();
        tienda.registrarCliente(cliente2);

        // Realizar ventas al contado
        tienda.realizarVentaAlContado(cliente1, laptop, 2);
        tienda.realizarVentaAlContadoConPagoAdicional(cliente2, telefono, 3, 50.0);

        // Mostrar inventario y clientes actualizados
        System.out.println("\nInventario actualizado:");
        for (Producto producto : tienda.getInventario()) {
            System.out.println();
            System.out.println(producto);
        }

        System.out.println("\nClientes registrados:");
        for (Cliente cliente : tienda.getClientes()) {
            System.out.println();
            System.out.println(cliente);
        }
    }
}
