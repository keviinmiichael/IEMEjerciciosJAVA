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

    
    public int atacarIndividualmente() {
        Random rand = new Random();
        int damage = rand.nextInt(ataque + 1); 
        int enemyDamage = rand.nextInt(Math.max(salud / 4 + 1, 1)) - rand.nextInt(Math.max(defensa / 2 + 1, 1));
        int totalDamage = Math.max(damage - enemyDamage, 0); 
        salud -= totalDamage; 
        return totalDamage; 
    }

    
    public int atacarEquipo(Equipo equipoEnemigo) {
        int totalDamage = 0;
        for (Soldado enemySoldier : equipoEnemigo.getSoldados()) {
            totalDamage += atacarIndividualmente(); 
        }
        return totalDamage;
    }
}
