package anexo9.Banco;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private List<CuentaBancaria> cuentas;
    private List<Prestamo> prestamos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public CuentaBancaria getCuentaPrincipal() {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta instanceof CuentaPrincipal) {
                return cuenta;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResumenFinanciero() {
        StringBuilder resumen = new StringBuilder("Resumen Financiero de " + nombre + "\n");
        for (CuentaBancaria cuenta : cuentas) {
            resumen.append(cuenta.getResumen()).append("\n");
        }
        for (Prestamo prestamo : prestamos) {
            resumen.append("Préstamo: ").append(prestamo.getCantidad()).append(" a devolver.\n");
        }
        return resumen.toString();
    }
}

