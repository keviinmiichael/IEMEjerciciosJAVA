package joyeria;

public class AnilloConDiamantes implements JoyaConDiamantes {
    private int cantidadDiamantes;

    @Override
    public void obtenerInformacion() {
        System.out.println("Anillo con diamantes");
        System.out.println("Diamantes: " + cantidadDiamantes);
    }

    @Override
    public double calcularPrecio() {
        // Lógica de cálculo de precio para anillo con diamantes
        return cantidadDiamantes * 100.0; // Precio ficticio para demostración
    }

    @Override
    public void agregarDiamantes(int cantidad) {
        this.cantidadDiamantes = cantidad;
    }
}
