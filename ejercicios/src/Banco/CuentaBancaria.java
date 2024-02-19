package Banco;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void añadirFondos(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirarFondos(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }
}
