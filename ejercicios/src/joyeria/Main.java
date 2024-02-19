package joyeria;

public class Main {
    public static void main(String[] args) {
        JoyaConDiamantes anillo = new AnilloConDiamantes();
        anillo.agregarDiamantes(5);
        anillo.obtenerInformacion();
        System.out.println("Precio: $" + anillo.calcularPrecio());

        System.out.println();

        JoyaConPerlas collar = new CollarConPerlas();
        collar.agregarPerlas(10);
        collar.obtenerInformacion();
        System.out.println("Precio: $" + collar.calcularPrecio());
    }
}
