package anexo8;

import java.util.List;

class Factura {
    private List<Mueble> muebles;
    private Cliente cliente;
    private double descuentoEspecifico;

    public Factura(List<Mueble> muebles, Cliente cliente, double descuentoEspecifico) {
        this.muebles = muebles;
        this.cliente = cliente;
        this.descuentoEspecifico = descuentoEspecifico;
    }

    public double calcularDescuentoTotal() {
        double descuentoMuebles = muebles.stream().mapToDouble(Mueble::calcularDescuento).sum();
        double descuentoCliente = cliente.getPuntosFidelidad() * 0.01; 
        double descuentoTotal = descuentoMuebles + descuentoCliente + descuentoEspecifico;

        
        return Math.min(descuentoTotal, 0.4);
    }

    public double calcularTotal() {
        double total = muebles.stream().mapToDouble(mueble -> mueble.getPrecio() - mueble.calcularDescuento()).sum();
        return total - calcularDescuentoTotal() * total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura:\n");
        sb.append("Cliente: ").append(cliente.toString()).append("\n");
        sb.append("Muebles:\n");
        for (Mueble mueble : muebles) {
            sb.append("- ").append(mueble.toString()).append("\n");
        }
        sb.append("Descuento Específico: ").append(descuentoEspecifico * 100).append("%\n");
        sb.append("Descuento Total: ").append(calcularDescuentoTotal() * 100).append("%\n");
        sb.append("Total a Pagar: $").append(calcularTotal());
        return sb.toString();
    }
}
