package anexo9.CallOfDuty;

import java.util.Random;

public class Soldado {
    private String nombre;
    private int salud;
    private int defensa;
    private int ataque;

    public Soldado(String nombre, int salud, int defensa, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.defensa = defensa;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    // Método para realizar un ataque individual
    public int atacarIndividualmente() {
        Random rand = new Random();
        int damage = rand.nextInt(ataque + 1); // Daño aleatorio entre 0 y ataque
        int enemyDamage = rand.nextInt(Math.max(salud / 4 + 1, 1)) - rand.nextInt(Math.max(defensa / 2 + 1, 1));
        int totalDamage = Math.max(damage - enemyDamage, 0); // Daño total, no puede ser negativo
        salud -= totalDamage; // Actualiza la salud del soldado
        return totalDamage; // Retorna el daño causado
    }

    // Método para realizar un ataque colectivo a un equipo enemigo
    public int atacarEquipo(Equipo equipoEnemigo) {
        int totalDamage = 0;
        for (Soldado enemySoldier : equipoEnemigo.getSoldados()) {
            totalDamage += atacarIndividualmente(); // Acumula el daño total causado por el equipo
        }
        return totalDamage;
    }
}
