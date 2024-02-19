package anexo82;

import java.util.ArrayList;
import java.util.List;

class Destino {
    private String nombre;
    private List<String> tiposCargaPermitidos;

    public Destino(String nombre, List<String> tiposCargaPermitidos) {
        this.nombre = nombre;
        this.tiposCargaPermitidos = tiposCargaPermitidos;
    }

    public boolean aceptaTipoCarga(String tipoCarga) {
        return tiposCargaPermitidos.contains(tipoCarga);
    }

    @Override
    public String toString() {
        return "Destino: " + nombre;
    }
}
