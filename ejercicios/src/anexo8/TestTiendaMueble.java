package anexo8;

import java.util.List;

public class TestTiendaMueble {
    public static void main(String[] args) {
        // Crear una tienda de muebles
        TiendaMueble tienda = new TiendaMueble();

        // Agregar muebles al inventario
        Mueble mueble1 = new Mueble("Silla", 50.0, 10);
        Mueble mueble2 = new Mueble("Mesa", 100.0, 5);
        tienda.agregarMueble(mueble1);
        tienda.agregarMueble(mueble2);

        // Agregar clientes
        Cliente cliente1 = new Cliente("Juan");
        Cliente cliente2 = new Cliente("Maria");
        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        // Realizar venta con descuento específico
        List<Mueble> mueblesVenta = List.of(mueble1, mueble2);
        double descuentoEspecifico = 0.1; // 10%
        Factura factura = tienda.realizarVenta(mueblesVenta, cliente1, descuentoEspecifico);

        // Mostrar la tienda y la factura
        System.out.println(tienda.toString());
        System.out.println(factura.toString());
    }
}
