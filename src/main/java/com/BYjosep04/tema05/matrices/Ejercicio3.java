package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;
import com.BYjosep04.tema05.matrices.Ejercicio3.Ficha;

import java.util.Scanner;

public class Ejercicio3 {
    public enum Ficha {
        O, X
    }

    public enum Jugador {
        PLAYER1,
        PLAYER2
    }

    public static Ficha[][] matriz = new Ficha[3][3];
    public static Jugador turnoActual = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguirJugando;

        do {
            reset(turnoActual);


            System.out.println("¿Desea volver a jugar? S/N");
            char opcion = Character.toLowerCase(scanner.nextLine().charAt(0));
            seguirJugando = opcion == 's';
        } while (seguirJugando);


    }

    public static void play(Ficha[][] matriz) {
        boolean jugadaValida;
        int columna, fila;
        /*
        Esta entrada parte de 1, ya que en el trs en raya normal
        se da por hecho que la casilla central está en la cordenada 2,2
         */
        do {
            fila = LibStrings.ingresarUnNumero("Indique en que fila desea poner la ficha", 1, 3);
            fila--;
            columna = LibStrings.ingresarUnNumero("Indique la columna desea poner la ficha", 1, 3);
            columna--;

            jugadaValida = esJugadaValida(fila, columna);
        } while (!jugadaValida);

        matriz[fila][columna] = Ficha;


    }

    public static void reset(Jugador turnoActual) {
        matriz = new Ficha[3][3];
        turnoActual = null;

    }

    public static boolean esJugadaValida(int fila, int columna) {

        return matriz[fila][columna] == null;
    }

}
