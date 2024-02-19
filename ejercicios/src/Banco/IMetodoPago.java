package Banco;

public interface IMetodoPago {
    boolean realizarPago(double cantidad);
    double calcularComision(double cantidad);
    boolean pagoPermitido();
    String generarMensajeExito(double cantidad);
}
