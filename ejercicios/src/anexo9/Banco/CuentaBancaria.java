package anexo9.Banco;

import java.util.ArrayList;
import java.util.List;

abstract class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private List<String> historialTransacciones;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.historialTransacciones = new ArrayList<>();
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        registrarTransaccion("Depósito", cantidad);
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            registrarTransaccion("Retiro", -cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void transferir(CuentaBancaria destino, double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            destino.depositar(cantidad);
            registrarTransaccion("Transferencia a " + destino.getNumeroCuenta(), -cantidad);
            destino.registrarTransaccion("Transferencia desde " + getNumeroCuenta(), cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }

    public void registrarTransaccion(String tipo, double cantidad) {
        historialTransacciones.add(tipo + ": " + cantidad);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getResumen() {
        StringBuilder resumen = new StringBuilder("Cuenta: " + numeroCuenta + ", Saldo: " + saldo + "\n");
        for (String transaccion : historialTransacciones) {
            resumen.append("- ").append(transaccion).append("\n");
        }
        return resumen.toString();
    }
}








