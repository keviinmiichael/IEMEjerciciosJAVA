package anexo82;

import java.util.ArrayList;
import java.util.List;

class EmpresaTransporte {
    private List<Camion> flota;
    private List<Destino> destinos;
    private RegistroCarga registroCarga;

    public EmpresaTransporte() {
        this.flota = new ArrayList<>();
        this.destinos = new ArrayList<>();
        this.registroCarga = new RegistroCarga();
    }

    public void agregarCamion(Camion camion) {
        flota.add(camion);
    }

    public void agregarDestino(Destino destino) {
        destinos.add(destino);
    }

    public boolean enviarCarga(Camion camion, Destino destino, Carga carga) {
        boolean envioExitoso = camion.realizarEnvio(destino, carga);
        if (envioExitoso) {
            registroCarga.registrarCargaEnviada(carga);
        }
        return envioExitoso;
    }


    public ArrayList<Carga> getCargasEnviadas() {
        return (ArrayList<Carga>) registroCarga.getCargasEnviadas();
    }

    @Override
    public String toString() {
        return "Empresa de Transporte";
    }

}
