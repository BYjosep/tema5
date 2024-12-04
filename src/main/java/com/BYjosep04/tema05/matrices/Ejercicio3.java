package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Ficha {
        O, X
    }

    public enum Jugador {
        PLAYER1,
        PLAYER2
    }

    private static Ficha[][] tablero;
    private static Jugador turnoActual;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguirJugando;

        do {
            reset();
            play();

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
            fila = LibStrings.ingresarUnNumero("Indique en que fila desea poner la ficha", 1, 3);
            fila--;
            columna = LibStrings.ingresarUnNumero("Indique la columna desea poner la ficha", 1, 3);
            columna--;

            jugadaValida = esJugadaValida(fila, columna);
            if (!jugadaValida) {
                System.err.println("La posicion ya esta ocupada");
            }
        } while (!jugadaValida);
        tablero[fila][columna] = getFichaJugada(turnoActual);

    }

    private static void reset() {
        Random random = new Random();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }
        }
        Jugador[] valoresJugadores = Jugador.values();
        turnoActual = valoresJugadores[random.nextInt(0, valoresJugadores.length)];

    }

    private static boolean esJugadaValida(int fila, int columna) {

        return tablero[fila][columna] == null;
    }

    private static String tabletoToString() {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < tablero.length; i++) {
            sb.append("|---|---|---|\n");
            for (int j = 0; j < tablero[i].length; j++) {
                sb.append("| ").append(tablero[i][j]).append(" ");
            }
            sb.append("|\n");
        }
        sb.append("|---|---|---|\n");
        return sb.toString();
    }

    private static Ficha getFichaJugada(Jugador jugador) {
        return Ficha.values()[jugador.ordinal()];
    }

}
