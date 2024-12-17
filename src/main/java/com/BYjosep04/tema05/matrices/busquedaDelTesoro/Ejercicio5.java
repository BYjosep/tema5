package com.BYjosep04.tema05.matrices.busquedaDelTesoro;


import java.util.Random;

public class Ejercicio5 {
    private static Celda[][] mapa;
    private static final Random random = new Random();
    private static Posicion[] posicionsLibres;
    private static int cantidadPosicionesLibres;

    private enum Celda {
        VACIA(Config.SPRITE_VACIO),
        NPC(Config.SPRITE_NPC),
        OPSTACULO(Config.SPRITE_OBSTACULO),
        TESORO(Config.SPRITE_TESORO),
        JUGADOR(Config.SPRITE_JUGADOR),
        EXCAVADA(Config.SPRITE_EXCAVADO),
        HABILIDAD(Config.SPRITE_HABILIDAD);

        private final String sprite;

        Celda(String sprite) {
            this.sprite = sprite;
        }

        @Override
        public String toString() {
            return sprite;
        }

    }

    public static void main(String[] args) {
        mapa = new Celda[Config.FILAS][Config.COLUMNAS];

        cantidadPosicionesLibres = 0;
        posicionsLibres = new Posicion[Config.FILAS * Config.COLUMNAS];

    }

    public static void generarMapa() {
        cantidadPosicionesLibres = 0;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = Celda.VACIA;
                posicionsLibres[cantidadPosicionesLibres++] = new Posicion(i, j);
            }

        }

    }

    private static void reset() {
        generarMapa();
    }

    public static String mapaToString(Celda[][] mapa) {
        StringBuilder sb = new StringBuilder();
        for (Celda[] fila : mapa) {
            for (Celda celda : fila) {
                sb.append(celda);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void generarCeldaAleatoria(Celda celda) {
        if (cantidadPosicionesLibres == 0) {
            return;
        }

        int indiceAleatorio = random.nextInt(cantidadPosicionesLibres);

        Posicion posicion = posicionsLibres[indiceAleatorio];
        cantidadPosicionesLibres--;

        posicionsLibres[indiceAleatorio] = posicionsLibres[cantidadPosicionesLibres];
        mapa[posicion.fila][posicion.columna] = celda;
    }


    public static class Posicion {
        private final int fila;
        private final int columna;

        public Posicion(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }
    }
}
