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
        return cantidadDiamantes * 100.0; 
    }

    @Override
    public void agregarDiamantes(int cantidad) {
        this.cantidadDiamantes = cantidad;
    }
}
