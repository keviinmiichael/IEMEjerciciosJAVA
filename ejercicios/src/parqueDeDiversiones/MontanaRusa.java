package parqueDeDiversiones;

class MontanaRusa extends Atraccion {
    private int numeroVueltas;

    public MontanaRusa(String nombre, double costoBase, int numeroVueltas) {
        super(nombre, costoBase);
        this.numeroVueltas = numeroVueltas;
    }

    @Override
    public double calcularPrecioEntrada() {
        return getCostoBase() + (numeroVueltas * 2.5);
    }
}
