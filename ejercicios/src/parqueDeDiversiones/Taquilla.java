package parqueDeDiversiones;

import java.util.ArrayList;
import java.util.List;

class Taquilla {
    private List<Atraccion> atracciones;

    public Taquilla() {
        this.atracciones = new ArrayList<>();
    }

    public void agregarAtraccion(Atraccion atraccion) {
        atracciones.add(atraccion);
    }

    public double calcularPrecioTotalEntrada() {
        double precioTotal = 0.0;

        for (Atraccion atraccion : atracciones) {
            precioTotal += atraccion.calcularPrecioEntrada();
        }

        return precioTotal;
    }

    public void mostrarDetalleParque() {
        System.out.println("Detalle del Parque:");
        for (Atraccion atraccion : atracciones) {
            System.out.println("- " + atraccion.getNombre() + ": $" + atraccion.calcularPrecioEntrada());
        }
        System.out.println("Precio Total de Entrada: $" + calcularPrecioTotalEntrada());
    }
}
