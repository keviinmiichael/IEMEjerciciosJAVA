package joyeria;

public class CollarConPerlas implements JoyaConPerlas {
    private int cantidadPerlas;

    @Override
    public void obtenerInformacion() {
        System.out.println("Collar con perlas");
        System.out.println("Perlas: " + cantidadPerlas);
    }

    @Override
    public double calcularPrecio() {
        // Lógica de cálculo de precio para collar con perlas
        return cantidadPerlas * 50.0; // Precio ficticio para demostración
    }

    @Override
    public void agregarPerlas(int cantidad) {
        this.cantidadPerlas = cantidad;
    }
}

