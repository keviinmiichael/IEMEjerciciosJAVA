package anexo82;

import java.util.ArrayList;
import java.util.List;

class RegistroCarga {
    private List<Carga> cargasEnviadas;

    public RegistroCarga() {
        this.cargasEnviadas = new ArrayList<>();
    }

    public void registrarCargaEnviada(Carga carga) {
        cargasEnviadas.add(carga);
    }

    public List<Carga> getCargasEnviadas() {
        return new ArrayList<>(cargasEnviadas);
    }

    @Override
    public String toString() {
        return "Registro de Cargas Enviadas";
    }
}