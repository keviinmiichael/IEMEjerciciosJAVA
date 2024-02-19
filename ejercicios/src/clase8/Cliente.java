package clase8;

class Cliente {
    private String nombre;
    private int edad;
    private double saldoDisponible;

    public Cliente(String nombre, int edad, double saldoDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldoDisponible = saldoDisponible;
    }

    public void comprarAlContado(Producto producto, int cantidad) {
        double precioTotal = producto.calcularPrecioTotal(cantidad);

        if (saldoDisponible >= precioTotal) {
            saldoDisponible -= precioTotal;
            System.out.println();
            System.out.println("Compra al contado realizada. Saldo restante: $" + saldoDisponible);
        } else {
            System.out.println();
            System.out.println("Saldo insuficiente para realizar la compra al contado.");
        }
    }

    public void comprarAlContado(Producto producto, int cantidad, double pagoAdicional) {
        double precioTotal = producto.calcularPrecioTotal(cantidad) + pagoAdicional;

        if (saldoDisponible >= precioTotal) {
            saldoDisponible -= precioTotal;
            System.out.println();
            System.out.println("Compra al contado con pago adicional realizada. Saldo restante: $" + saldoDisponible);
        } else {
            System.out.println();
            System.out.println("Saldo insuficiente para realizar la compra al contado con pago adicional.");
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Edad: " + edad + ", Saldo Disponible: $" + saldoDisponible;
    }
}
