package anexo9.Banco;

class Prestamo {
    private Banco banco;
    private Cliente cliente;
    private CuentaBancaria cuentaBancaria;
    private double cantidad;

    public Prestamo(Banco banco, Cliente cliente, CuentaBancaria cuentaBancaria, double cantidad) {
        this.banco = banco;
        this.cliente = cliente;
        this.cuentaBancaria = cuentaBancaria;
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
}