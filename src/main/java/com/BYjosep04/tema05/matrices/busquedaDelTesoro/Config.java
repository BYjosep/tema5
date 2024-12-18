package com.BYjosep04.tema05.matrices.busquedaDelTesoro;

public class Config {
    // Constantes de configuración general
    public static final int FILAS = 8;
    public static final int COLUMNAS = FILAS * 4;
    public static final int USOS_PICO = 3;
    public static final int CANTIDAD_OBSTACULOS = FILAS - 1;
    public static final int CANTIDAD_NPC = (FILAS * COLUMNAS) / 4;
    public static final int CANTIDAD_HABILIDADES = CANTIDAD_NPC;

    // Constantes para sprites
    public static final String SPRITE_JUGADOR = "@";
    public static final String SPRITE_OBSTACULO = "X";
    public static final String SPRITE_NPC = "N";
    public static final String SPRITE_TESORO = "T";
    public static final String SPRITE_VACIA = " ";
    public static final String SPRITE_HABILIDAD = "?";
    public static final String SPRITE_EXCAVADA = "*";



}
