package parqueDeDiversiones;

class MontanaRusa extends Atraccion {
    private int numeroVueltas;

    public MontanaRusa(String nombre, double costoBase, int numeroVueltas) {
        super(nombre, costoBase);
        this.numeroVueltas = numeroVueltas;
    }

    @Override
    public double calcularPrecioEntrada() {
        // Reglas específicas para calcular el precio de entrada a la montaña rusa
        return getCostoBase() + (numeroVueltas * 2.5);
    }
}
