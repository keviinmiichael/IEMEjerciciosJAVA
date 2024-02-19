package clase8;

public class TestVentaVehiculos {
    public static void main(String[] args) {
        // Crear instancia de Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 20000.0);

        // Crear instancia de Comprador
        Comprador comprador = new Comprador("Juan", 30, 25000.0);

        // Combinaciones de métodos para calcular precio final con impuestos y descuento
        double impuestos = 1000.0;
        int descuento = 500;

        double precioConImpuestos = vehiculo.calcularPrecioFinal(impuestos);
        double precioConDescuento = vehiculo.calcularPrecioFinal(descuento);
        double precioConAmbas = vehiculo.calcularPrecioFinal(impuestos, descuento);

        // Combinaciones de métodos para evaluar oferta directa y financiamiento
        int cuotas = 12;
        double tasaInteres = 0.05;

        boolean ofertaDirectaAceptada = comprador.evaluarOferta(vehiculo);
        boolean ofertaFinanciamientoAceptada = comprador.evaluarOferta(vehiculo, cuotas, tasaInteres);

        // Mostrar resultados
        System.out.println();
        System.out.println("Precio con impuestos: $" + precioConImpuestos);
        System.out.println();
        System.out.println("Precio con descuento: $" + precioConDescuento);
        System.out.println();
        System.out.println("Precio con ambas operaciones: $" + precioConAmbas);
        System.out.println();
        System.out.println("Oferta directa aceptada: " + (ofertaDirectaAceptada ? "Sí" : "No"));
        System.out.println();
        System.out.println("Oferta financiamiento aceptada: " + (ofertaFinanciamientoAceptada ? "Sí" : "No"));
        System.out.println();
    }
    
}
