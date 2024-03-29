package parqueDeDiversiones;

abstract class Atraccion {
    private String nombre;
    private double costoBase;

    public Atraccion(String nombre, double costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public abstract double calcularPrecioEntrada();
}
