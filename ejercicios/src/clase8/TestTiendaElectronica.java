package clase8;

public class TestTiendaElectronica {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 800.0, 10);
        Producto telefono = new Producto("Teléfono", 300.0, 20);

        Cliente cliente1 = new Cliente("Carlos", 25, 1000.0);
        Cliente cliente2 = new Cliente("Ana", 30, 1500.0);

        TiendaElectronica tienda = new TiendaElectronica();

        System.out.println();
        tienda.agregarProducto(laptop);
        System.out.println();
        tienda.agregarProducto(telefono);
        System.out.println();
        tienda.registrarCliente(cliente1);
        System.out.println();
        tienda.registrarCliente(cliente2);

        tienda.realizarVentaAlContado(cliente1, laptop, 2);
        tienda.realizarVentaAlContadoConPagoAdicional(cliente2, telefono, 3, 50.0);

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
