package anexo82;

import java.util.List;

public class TestEmpresaTransporte {
    public static void main(String[] args) {
        EmpresaTransporte empresa = new EmpresaTransporte();

        Camion camion1 = new Camion("ABC123", 5000);
        Camion camion2 = new Camion("XYZ789", 8000);
        empresa.agregarCamion(camion1);
        empresa.agregarCamion(camion2);

        List<String> tiposCargaPermitidosDestino1 = List.of("Electrónicos", "Ropa");
        Destino destino1 = new Destino("Ciudad A", tiposCargaPermitidosDestino1);
        empresa.agregarDestino(destino1);

        List<String> tiposCargaPermitidosDestino2 = List.of("Alimentos", "Electrodomésticos");
        Destino destino2 = new Destino("Ciudad B", tiposCargaPermitidosDestino2);
        empresa.agregarDestino(destino2);

        Carga carga1 = new Carga("Electrónicos", 2000);
        Carga carga2 = new Carga("Alimentos", 3000);

        empresa.enviarCarga(camion1, destino1, carga1);
        empresa.enviarCarga(camion2, destino2, carga2);

        System.out.println(empresa.toString());
        System.out.println(camion1.toString());
        System.out.println("Historial de envíos del Camion 1:");
        camion1.getHistorialEnvios().forEach(System.out::println);

        System.out.println(camion2.toString());
        System.out.println("Historial de envíos del Camion 2:");
        camion2.getHistorialEnvios().forEach(System.out::println);

        System.out.println(empresa.toString());
        System.out.println(empresa.toString());
        System.out.println("Registro de Cargas Enviadas:");
        empresa.getCargasEnviadas().forEach(System.out::println);
    }
}
