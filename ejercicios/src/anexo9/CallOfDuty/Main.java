package anexo9.CallOfDuty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        Equipo equipo1 = new Equipo("EquipoA");
        Equipo equipo2 = new Equipo("EquipoB");

        juego.agregarEquipo(equipo1);
        juego.agregarEquipo(equipo2);

        Soldado soldado1 = new Soldado("Soldado1", 100, 20, 30);
        Soldado soldado2 = new Soldado("Soldado2", 120, 25, 25);
        Soldado soldado3 = new Soldado("Soldado3", 80, 15, 35);

        equipo1.reclutarSoldado(soldado1);
        equipo1.reclutarSoldado(soldado2);
        equipo2.reclutarSoldado(soldado3);

        while (!juego.juegoTerminado()) {
            int damage1 = equipo1.atacarEquipoEnemigo(Arrays.asList(equipo2));
            int damage2 = equipo2.atacarEquipoEnemigo(Arrays.asList(equipo1));

            System.out.println("Daño causado por " + equipo1.getNombre() + ": " + damage1);
            System.out.println("Daño causado por " + equipo2.getNombre() + ": " + damage2);
        }
    }
}

