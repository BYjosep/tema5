package com.BYjosep04.tema05.matrices.busquedaDelTesoro;

import com.BYjosep04.tema05.lib.ANSI;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.util.Random;

public class Ejercicio5 implements NativeKeyListener {
    public enum Celda {
        VACIA(Config.SPRITE_VACIA),
        NPC(Config.SPRITE_NPC),
        OBSTACULO(Config.SPRITE_OBSTACULO),
        TESORO(Config.SPRITE_TESORO),
        JUGADOR(Config.SPRITE_JUGADOR),
        EXCAVADA(Config.SPRITE_EXCAVADA),
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

    private static Random random;
    private static Celda[][] mapa;
    private static Posicion[] posicionesLibres;
    private static int cantidadPosicionesLibres;


    public static void main(String[] args) {
        mapa = new Celda[Config.FILAS][Config.COLUMNAS];
        random = new Random();
        cantidadPosicionesLibres = 0;
        posicionesLibres = new Posicion[Config.FILAS * Config.COLUMNAS];

        try {
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new Ejercicio5());
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }

        reset();

        System.out.println(mapaToString(mapa));
    }

    public static void reset() {
        generarMapa();
    }



    public static void generarMapa() {
        // Reiniciar posiciones libres
        cantidadPosicionesLibres = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = Celda.VACIA;
                posicionesLibres[cantidadPosicionesLibres++] = new Posicion(i, j);
            }
        }

        // Generamos obstáculos
        for (int i = 0; i < Config.CANTIDAD_OBSTACULOS; i++) {
            generarCeldaAleatoria(Celda.OBSTACULO);
        }

        // Generamos NPC
        for (int i = 0; i < Config.CANTIDAD_NPC; i++) {
            generarCeldaAleatoria(Celda.NPC);
        }

        // Generamos HABILIDADES
        for (int i = 0; i < Config.CANTIDAD_HABILIDADES; i++) {
            generarCeldaAleatoria(Celda.HABILIDAD);
        }

        generarCeldaAleatoria(Celda.TESORO);

        generarCeldaAleatoria(Celda.JUGADOR);

    }

    public static void generarCeldaAleatoria(Celda celda) {
        // Si no hay posiciones libres, salimos
        if (cantidadPosicionesLibres == 0) {
            return;
        }
        // Generamos un índice aleatorio
        int indiceAleatorio = random.nextInt(cantidadPosicionesLibres);
        // Obtenemos la posición que hay en ese índice
        Posicion posicion = posicionesLibres[indiceAleatorio];
        // Decrementamos la cantidad de posiciones libres
        cantidadPosicionesLibres--;
        // Ubicamos el último elemento en la posición que acabamos de extraer
        posicionesLibres[indiceAleatorio] = posicionesLibres[cantidadPosicionesLibres];
        // Finalmente, ponemos la celda que hemos recibido como parámetro en la posición indicada
        mapa[posicion.fila][posicion.columna] = celda;
    }


    public static String mapaToString(Celda[][] mapa) {
        StringBuilder sb = new StringBuilder();
        sb.append(Celda.OBSTACULO.sprite.repeat(mapa[0].length + 2)).append("\n");
        for (Celda[] fila : mapa) {
            sb.append(Celda.OBSTACULO);
            for (Celda celda : fila) {
                sb.append(celda);
            }
            sb.append(Celda.OBSTACULO).append("\n");
        }
        sb.append(Celda.OBSTACULO.sprite.repeat(mapa[0].length + 2)).append("\n");
        return sb.toString();
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        ANSI.clearScreen();
        System.out.println(mapaToString(mapa));
        System.out.println("Key Typed: " + e.getKeyChar());
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
