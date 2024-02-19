package Banco;

public class Cliente {
    private String dni;
    private CuentaBancaria cuenta;

    public Cliente(String dni, double saldoInicial) {
        this.dni = dni;
        this.cuenta = new CuentaBancaria(saldoInicial);
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}
