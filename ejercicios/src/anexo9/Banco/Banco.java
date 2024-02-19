package anexo9.Banco;

import java.util.ArrayList;
import java.util.List;

class Banco {
    private String nombre;
    private List<Cliente> clientes;
    private double tasaInteres;

    public Banco(String nombre, double tasaInteres) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.tasaInteres = tasaInteres;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarPrestamo(Cliente cliente, double cantidad) {
        CuentaBancaria cuentaPrincipal = cliente.getCuentaPrincipal();
        if (cuentaPrincipal != null && cuentaPrincipal.getSaldo() >= cantidad) {
            Prestamo prestamo = new Prestamo(this, cliente, cuentaPrincipal, cantidad);
            cliente.agregarPrestamo(prestamo);
            cuentaPrincipal.registrarTransaccion("Préstamo", -cantidad);
            System.out.println("Préstamo realizado con éxito a " + cliente.getNombre());
        } else {
            System.out.println("No se puede realizar el préstamo para " + cliente.getNombre());
        }
    }

    public void imprimirResumenFinanciero() {
        System.out.println("Resumen Financiero del Banco " + nombre);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getResumenFinanciero());
        }
    }
}

