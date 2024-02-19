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
        return cantidadPerlas * 50.0;
    }

    @Override
    public void agregarPerlas(int cantidad) {
        this.cantidadPerlas = cantidad;
    }
}

