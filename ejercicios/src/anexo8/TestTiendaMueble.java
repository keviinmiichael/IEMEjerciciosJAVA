package anexo8;

import java.util.List;

public class TestTiendaMueble {
    public static void main(String[] args) {
        TiendaMueble tienda = new TiendaMueble();

        Mueble mueble1 = new Mueble("Silla", 50.0, 10);
        Mueble mueble2 = new Mueble("Mesa", 100.0, 5);
        tienda.agregarMueble(mueble1);
        tienda.agregarMueble(mueble2);

        Cliente cliente1 = new Cliente("Juan");
        Cliente cliente2 = new Cliente("Maria");
        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        List<Mueble> mueblesVenta = List.of(mueble1, mueble2);
        Factura factura = tienda.realizarVenta(mueblesVenta, cliente1, descuentoEspecifico);

        System.out.println(tienda.toString());
        System.out.println(factura.toString());
    }
}
