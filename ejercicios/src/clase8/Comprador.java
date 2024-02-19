package clase8;

class Comprador {
    private String nombre;
    private int edad;
    private double presupuesto;

    public Comprador(String nombre, int edad, double presupuesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.presupuesto = presupuesto;
    }

    public boolean evaluarOferta(Vehiculo vehiculo) {
        return vehiculo.calcularPrecioFinal(0) <= presupuesto;
    }

    public boolean evaluarOferta(Vehiculo vehiculo, int cuotas, double tasaInteres) {
        double precioFinal = vehiculo.calcularPrecioFinal(0);
        double precioCuota = precioFinal / cuotas * (1 + tasaInteres);
        return precioCuota <= presupuesto;
    }
}

