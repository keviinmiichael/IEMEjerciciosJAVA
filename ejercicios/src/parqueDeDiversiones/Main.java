package parqueDeDiversiones;

public class Main {
    public static void main(String[] args) {
        Taquilla taquilla = new Taquilla();

        MontanaRusa montanaRusa = new MontanaRusa("Montaña Rusa Emocionante", 20.0, 3);
        Carrusel carrusel = new Carrusel("Carrusel Mágico", 15.0, true);

        taquilla.agregarAtraccion(montanaRusa);
        taquilla.agregarAtraccion(carrusel);

        taquilla.mostrarDetalleParque();
    }
}

