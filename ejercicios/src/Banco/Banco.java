package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<String> historialOperaciones = new ArrayList<>();

    public static void registrarOperacion(String mensaje) {
        historialOperaciones.add(mensaje);
    }

    public static void mostrarHistorialOperaciones() {
        System.out.println("Historial de Operaciones:");
        for (String operacion : historialOperaciones) {
            System.out.println(operacion);
        }
        System.out.println();
    }
}
