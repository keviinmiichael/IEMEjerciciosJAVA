package parqueDeDiversiones;

public class Main {
    public static void main(String[] args) {
        Taquilla taquilla = new Taquilla();

        // Instanciar atracciones
        MontanaRusa montanaRusa = new MontanaRusa("Montaña Rusa Emocionante", 20.0, 3);
        Carrusel carrusel = new Carrusel("Carrusel Mágico", 15.0, true);

        // Agregar atracciones a la taquilla
        taquilla.agregarAtraccion(montanaRusa);
        taquilla.agregarAtraccion(carrusel);

        // Mostrar detalle del parque
        taquilla.mostrarDetalleParque();
    }
}

