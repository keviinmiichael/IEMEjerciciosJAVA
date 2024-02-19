package exceptions.files;
import java.util.Scanner;

public class BatallaNaval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño del océano
        int n = 5;

        // Crear océanos para cada equipo
        char[][] oceanTeam1 = createOcean(n);
        char[][] oceanTeam2 = createOcean(n);
        char[][] oceanTeam3 = createOcean(n);

        // Colocar barcos en los océanos
        placeShips(oceanTeam1, "Equipo 1", scanner);
        placeShips(oceanTeam2, "Equipo 2", scanner);
        placeShips(oceanTeam3, "Equipo 3", scanner);

        // Iniciar el juego
        while (true) {
            // Turno de Equipo 1
            performAttack(oceanTeam1, "Equipo 1", oceanTeam2, oceanTeam3, scanner);
            if (isGameOver(oceanTeam2, oceanTeam3)) {
                printWinner("Equipo 1");
                break;
            }

            // Turno de Equipo 2
            performAttack(oceanTeam2, "Equipo 2", oceanTeam1, oceanTeam3, scanner);
            if (isGameOver(oceanTeam1, oceanTeam3)) {
                printWinner("Equipo 2");
                break;
            }

            // Turno de Equipo 3
            performAttack(oceanTeam3, "Equipo 3", oceanTeam1, oceanTeam2, scanner);
            if (isGameOver(oceanTeam1, oceanTeam2)) {
                printWinner("Equipo 3");
                break;
            }
        }
    }

    private static char[][] createOcean(int n) {
        char[][] ocean = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ocean[i][j] = '~'; // Inicializar todo con agua
            }
        }
        return ocean;
    }

    private static void placeShips(char[][] ocean, String teamName, Scanner scanner) {
        System.out.println("Colocar barcos para " + teamName);
        // Puedes implementar la lógica para que los jugadores coloquen sus barcos en el océano aquí.
        // Este es un ejemplo básico.
        for (int i = 0; i < ocean.length; i++) {
            int shipColumn;
            do {
                try {
                    System.out.print("Fila " + (i + 1) + ": ");
                    shipColumn = Integer.parseInt(scanner.next()) - 1;
                    if (shipColumn < 0 || shipColumn >= ocean[i].length) {
                        throw new NumberFormatException();
                    }
                    if (ocean[i][shipColumn] != '~') {
                        throw new RuntimeException("¡Posición ocupada!");
                    }
                    break;  // Salir del bucle si la entrada es válida
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingresa una columna válida.");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } while (true);

            ocean[i][shipColumn] = 'B';
        }
        printOcean(ocean);
        System.out.println();
    }

    private static void performAttack(char[][] attackingOcean, String attackingTeam, char[][] targetOcean1,
                                      char[][] targetOcean2, Scanner scanner) {
        System.out.println(attackingTeam + ", es tu turno de atacar.");
        int attackRow;
        int attackColumn;
        do {
            try {
                System.out.print("Selecciona la fila para el ataque: ");
                attackRow = Integer.parseInt(scanner.next()) - 1;
                System.out.print("Selecciona la columna para el ataque: ");
                attackColumn = Integer.parseInt(scanner.next()) - 1;

                if (attackRow < 0 || attackRow >= attackingOcean.length ||
                    attackColumn < 0 || attackColumn >= attackingOcean[0].length) {
                    throw new NumberFormatException();
                }
                break;  // Salir del bucle si la entrada es válida
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa filas y columnas válidas.");
            }
        } while (true);

        if (targetOcean1[attackRow][attackColumn] == 'B') {
            System.out.println("¡Ataque exitoso! Barco hundido.");
            targetOcean1[attackRow][attackColumn] = 'X';
        } else if (targetOcean2[attackRow][attackColumn] == 'B') {
            System.out.println("¡Ataque exitoso! Barco hundido.");
            targetOcean2[attackRow][attackColumn] = 'X';
        } else {
            System.out.println("Ataque fallido. Solo agua.");
        }

        // Mostrar el estado actual de los océanos
        System.out.println("Estado actual de los océanos:");
        printOcean(attackingOcean);
        printOcean(targetOcean1);
        printOcean(targetOcean2);
        System.out.println();
    }

    private static boolean isGameOver(char[][] ocean1, char[][] ocean2) {
        // Verificar si todos los barcos en un océano han sido hundidos
        for (char[] row : ocean1) {
            for (char cell : row) {
                if (cell == 'B') {
                    return false; // Todavía hay barcos en el océano 1
                }
            }
        }

        for (char[] row : ocean2) {
            for (char cell : row) {
                if (cell == 'B') {
                    return false; // Todavía hay barcos en el océano 2
                }
            }
        }

        return true; // Todos los barcos han sido hundidos en ambos océanos
    }

    private static void printOcean(char[][] ocean) {
        for (char[] row : ocean) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static void printWinner(String teamName) {
        System.out.println("¡" + teamName + " es el equipo ganador!");
    }
}
