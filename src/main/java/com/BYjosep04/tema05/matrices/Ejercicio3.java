package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Ficha {
        O, X, NONE
    }

    public enum Jugador {
        PLAYER1,
        PLAYER2
    }

    private static final Ficha[][] tablero = new Ficha[3][3];
    private static Jugador turnoActual;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguirJugando;
        boolean partidaFinalizada;
        boolean hayGanador;
        do {
            reset();
            do {
                play();
                hayGanador = esJugadaGanadora(getFichaJugada(turnoActual));
                if (!hayGanador) {
                    turnoActual = siguienteTurno();

                }
                partidaFinalizada = hayGanador || esEmpate();

            } while (!partidaFinalizada);

            System.out.println("¿Desea volver a jugar? S/N");
            char opcion = Character.toLowerCase(scanner.nextLine().charAt(0));
            seguirJugando = opcion == 's';
        } while (seguirJugando);

        LibStrings.cerrarScaner();
    }

    public static void play() {
        boolean jugadaValida;
        int columna, fila;
        /*
        Esta entrada parte de 1, ya que en el trs en raya normal
        se da por hecho que la casilla central está en la cordenada 2,2
         */
        do {
            System.out.println("Turno " + turnoActual + "(" + getFichaJugada(turnoActual) + ")");
            fila = LibStrings.ingresarUnaOpcion("Indique en que fila desea poner la ficha", 1, 3);
            fila--;
            columna = LibStrings.ingresarUnaOpcion("Indique la columna desea poner la ficha", 1, 3);
            columna--;

            jugadaValida = esJugadaValida(fila, columna);
            if (!jugadaValida) {
                System.err.println("La posicion ya esta ocupada");
            }
        } while (!jugadaValida);
        tablero[fila][columna] = getFichaJugada(turnoActual);
        System.out.println(tabletoToString());

    }

    private static Jugador siguienteTurno() {
        Jugador[] jugadors = Jugador.values();

        return jugadors[(turnoActual.ordinal() + 1) % jugadors.length];
    }

    private static void reset() {
        Random random = new Random();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = Ficha.NONE;
            }
        }
        Jugador[] valoresJugadores = Jugador.values();
        turnoActual = valoresJugadores[random.nextInt(0, valoresJugadores.length)];

    }

    private static boolean esJugadaValida(int fila, int columna) {

        return tablero[fila][columna] == Ficha.NONE;
    }

    private static String tabletoToString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tablero.length; i++) {
            sb.append("|---|---|---|\n");
            for (int j = 0; j < tablero[i].length; j++) {
                sb.append("| ").append(tablero[i][j] == Ficha.NONE ? " " : tablero[i][j]).append(" ");
            }
            sb.append("|\n");
        }
        sb.append("|---|---|---|\n");
        return sb.toString();
    }

    private static Ficha getFichaJugada(Jugador jugador) {
        return Ficha.values()[jugador.ordinal()];
    }

    private static boolean esJugadaGanadora(Ficha ficha) {
        int contadorHorizontal;
        int contadorVertical;
        int contadorDiagonal1 = 0;
        int contadorDiagonal2 = 0;
        for (int i = 0; i < tablero.length; i++) {
            contadorHorizontal = 0;
            contadorVertical = 0;

            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals(ficha)) {
                    contadorHorizontal++;
                }
                if (tablero[j][i].equals(ficha)) {
                    contadorVertical++;
                }
                //comprobar diagonales
                if (i == j && tablero[i][j].equals(ficha)) {
                    contadorDiagonal1++;
                }
                if (j == tablero.length - 1 - i && tablero[i][j].equals(ficha)) {
                    contadorDiagonal2++;
                }
            }
            if (contadorHorizontal == tablero[i].length || contadorVertical == tablero.length) {
                return true;
            }
            if (contadorDiagonal1 == tablero.length || contadorDiagonal2 == tablero.length) {
                return true;
            }
        }
        return false;
    }

    public static boolean esEmpate() {
        int casillasVacias = 0;
        for (Ficha[] fila : tablero) {
            for (Ficha columna : fila) {
                if (columna == Ficha.NONE) {
                    casillasVacias++;
                }
            }
        }
        if (casillasVacias > 0) {
            return false;
        } else {
            System.out.println("Ha habido un empate");
            return true;
        }

    }
}
