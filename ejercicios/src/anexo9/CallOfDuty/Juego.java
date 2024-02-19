package anexo9.CallOfDuty;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Equipo> equipos;

    public Juego() {
        this.equipos = new ArrayList<>();
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("Equipo agregado al juego: " + equipo.getNombre());
    }

    public boolean juegoTerminado() {
        for (Equipo equipo : equipos) {
            for (Soldado soldado : equipo.getSoldados()) {
                if (soldado.getSalud() <= 0) {
                    System.out.println("El juego ha llegado a su fin. ¡Equipo perdedor: " + equipo.getNombre() + "!");
                    return true;
                }
            }
        }
        return false;
    }

}

