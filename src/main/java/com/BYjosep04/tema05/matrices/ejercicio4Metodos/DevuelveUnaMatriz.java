package com.BYjosep04.tema05.matrices.ejercicio4Metodos;

import com.BYjosep04.tema05.lib.LibStrings;

public class DevuelveUnaMatriz {

    public static int[][] rellenarMatrizDeAleatiriosInt(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = LibStrings.aleatorioInt(-200, 200);
            }
        }
        return matriz;
    }

    public static int[][] crearMatrizTranspuesta(int[][] matriz) {
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        return matrizTranspuesta;
    }
}
