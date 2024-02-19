package clasesGenericas;

public class Envio<T> {
    private T carga;
    private String destino;

    public Envio(T carga, String destino) {
        this.carga = carga;
        this.destino = destino;
    }

    public T getCarga() {
        return carga;
    }

    public void setCarga(T carga) {
        this.carga = carga;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void realizarEnvio() {
        System.out.println("Enviando carga a " + destino + ": " + carga.toString());
        System.out.println("Envío completado.");
    }

    public static void main(String[] args) {
        Envio<String> envioPaquete = new Envio<>("Paquete fragil", "Ciudad A");
        envioPaquete.realizarEnvio();

        Envio<Double> envioMercancia = new Envio<>(1200.0, "Ciudad B");
        envioMercancia.realizarEnvio();

        CargaPersonalizada cargaPersonalizada = new CargaPersonalizada("Descripción personalizada");
        Envio<CargaPersonalizada> envioPersonalizado = new Envio<>(cargaPersonalizada, "Ciudad C");
        envioPersonalizado.realizarEnvio();
    }
}

class CargaPersonalizada {
    private String descripcion;

    public CargaPersonalizada(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Carga personalizada: " + descripcion;
    }
}

