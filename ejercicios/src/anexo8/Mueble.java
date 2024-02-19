package anexo8;

class Mueble {
    private String nombre;
    private double precio;
    private int stock;
    private double descuento;

    public Mueble(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descuento = 0.0;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void aplicarDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        return descuento;
    }

    public void restarStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("Error: Cantidad no válida");
        }
    }

    @Override
    public String toString() {
        return "Mueble: " + nombre + ", Precio: $" + precio + ", Stock: " + stock;
    }
}
