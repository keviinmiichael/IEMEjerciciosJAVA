package parqueDeDiversiones;

class Carrusel extends Atraccion {
    private boolean tieneMusica;

    public Carrusel(String nombre, double costoBase, boolean tieneMusica) {
        super(nombre, costoBase);
        this.tieneMusica = tieneMusica;
    }

    @Override
    public double calcularPrecioEntrada() {
        // Reglas específicas para calcular el precio de entrada al carrusel
        return getCostoBase() + (tieneMusica ? 1.5 : 0);
    }
}

