package Banco;

import java.util.Random;

public class Paypal implements IMetodoPago {
    private int intentosRestantes = 5;
    private static final double COMISION_PORCENTAJE = 0.03;
    private static final double PROBABILIDAD_EXITO = 0.7;

    @Override
    public boolean realizarPago(double cantidad) {
        if (pagoPermitido()) {
            Banco.registrarOperacion(generarMensajeExito(cantidad));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calcularComision(double cantidad) {
        return cantidad * COMISION_PORCENTAJE;
    }

    @Override
    public boolean pagoPermitido() {
        if (intentosRestantes > 0) {
            intentosRestantes--;
            return (new Random().nextDouble() <= PROBABILIDAD_EXITO);
        }
        return false;
    }

    @Override
    public String generarMensajeExito(double cantidad) {
        double comision = calcularComision(cantidad);
        return "Pago exitoso con PayPal. Cantidad: $" + cantidad + ", Comisión: $" + comision;
    }
}
