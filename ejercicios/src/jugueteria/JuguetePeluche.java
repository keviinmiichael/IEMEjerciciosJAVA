package jugueteria;

public class JuguetePeluche implements Juguete {
    private boolean lavable;

    public JuguetePeluche(boolean lavable) {
        this.lavable = lavable;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Juguete Peluche");
        System.out.println("Lavable: " + lavable);
    }

    @Override
    public double calcularPrecio() {
        // Lógica de cálculo de precio para juguete de peluche
        return lavable ? 15.0 : 10.0; // Precio ficticio para demostración
    }
}
