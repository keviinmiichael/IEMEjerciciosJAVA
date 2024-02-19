package clase8;

class Vehiculo {
    private String marca;
    private String modelo;
    private double precioBase;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return precioBase * 1.15;
    }

    public double calcularPrecioFinal(double descuento) {
        return precioBase - descuento;
    }

    public double calcularPrecioFinal(double impuestos, double descuento) {
        return calcularPrecioFinal(descuento) * impuestos;
    }
}