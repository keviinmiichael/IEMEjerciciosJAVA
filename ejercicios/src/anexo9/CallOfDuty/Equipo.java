package anexo9.CallOfDuty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Equipo {
    private String nombre;
    private List<Soldado> soldados;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.soldados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Soldado> getSoldados() {
        return soldados;
    }

    public void reclutarSoldado(Soldado soldado) {
        soldados.add(soldado);
        System.out.println("Soldado reclutado en el equipo " + nombre + ": " + soldado.getNombre());
    }

    public int atacarEquipoEnemigo(List<Equipo> equiposEnemigos) {
        Random rand = new Random();
        Equipo equipoEnemigo = equiposEnemigos.get(rand.nextInt(equiposEnemigos.size()));
        return atacarEquipo(equipoEnemigo);
    }

    private int atacarEquipo(Equipo equipoEnemigo) {
        int totalDamage = 0;
        for (Soldado soldier : soldados) {
            totalDamage += Math.max(soldier.atacarEquipo(equipoEnemigo), 0);
        }
        return totalDamage;
    }
}
