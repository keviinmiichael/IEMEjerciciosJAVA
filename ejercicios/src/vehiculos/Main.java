package vehiculos;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", 2022, 4);
        Motocicleta moto = new Motocicleta("Harley-Davidson", "Sportster", 2021, true);

        System.out.println("Información del Automóvil:");
        auto.mostrarInformacion();

        System.out.println("\nInformación de la Motocicleta:");
        moto.mostrarInformacion();
    }
}

