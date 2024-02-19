package jugueteria;

public class JugueteElectronico implements Juguete {
    private boolean pilasIncluidas;

    public JugueteElectronico(boolean pilasIncluidas) {
        this.pilasIncluidas = pilasIncluidas;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Juguete Electrónico");
        System.out.println("Pilas incluidas: " + pilasIncluidas);
    }

    @Override
    public double calcularPrecio() {
        return pilasIncluidas ? 25.0 : 20.0;
    }
}