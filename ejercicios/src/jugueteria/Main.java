package jugueteria;

public class Main {
    public static void main(String[] args) {
        Juguete jugueteElectronico = new JugueteElectronico(true);
        jugueteElectronico.obtenerInformacion();
        System.out.println("Precio: $" + jugueteElectronico.calcularPrecio());

        System.out.println();

        Juguete juguetePeluche = new JuguetePeluche(false);
        juguetePeluche.obtenerInformacion();
        System.out.println("Precio: $" + juguetePeluche.calcularPrecio());
    }
}
