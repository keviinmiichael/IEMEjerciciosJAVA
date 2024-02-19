package clase8;

class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public double calcularPrecioTotal(int cantidad) {
        return precio * cantidad;
    }

    public void realizarVenta(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadEnStock) {
            cantidadEnStock -= cantidad;
            System.out.println();
            System.out.println("Venta realizada. Cantidad en stock actual: " + cantidadEnStock);
        } else {
            System.out.println();
            System.out.println("No hay suficientes unidades en stock para realizar la venta.");
        }
    }

    public void realizarVenta(int cantidad, double descuento) {
        double precioConDescuento = precio * (1 - descuento);
        double totalConDescuento = precioConDescuento * cantidad;

        if (cantidad > 0 && cantidad <= cantidadEnStock) {
            cantidadEnStock -= cantidad;
            System.out.println();
            System.out.println("Venta realizada con descuento. Total: $" + totalConDescuento +
                    ". Cantidad en stock actual: " + cantidadEnStock);
        } else {
            System.out.println();
            System.out.println("No hay suficientes unidades en stock para realizar la venta con descuento.");
        }
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio + ", Cantidad en stock: " + cantidadEnStock;
    }
}