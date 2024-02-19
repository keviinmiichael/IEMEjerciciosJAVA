package anexo82;

import java.util.ArrayList;
import java.util.List;

class Camion {
    private String placa;
    private double capacidadMaxima;
    private List<Carga> historialEnvios;

    public Camion(String placa, double capacidadMaxima) {
        this.placa = placa;
        this.capacidadMaxima = capacidadMaxima;
        this.historialEnvios = new ArrayList<>();
    }

    public boolean realizarEnvio(Destino destino, Carga carga) {
        if (destino.aceptaTipoCarga(carga.getTipo()) && carga.getPeso() <= capacidadMaxima) {
            historialEnvios.add(carga);
            return true;
        }
        return false;
    }

    public List<Carga> getHistorialEnvios() {
        return new ArrayList<>(historialEnvios);
    }

    @Override
    public String toString() {
        return "Camion: " + placa + ", Capacidad Máxima: " + capacidadMaxima + " kg";
    }
}

