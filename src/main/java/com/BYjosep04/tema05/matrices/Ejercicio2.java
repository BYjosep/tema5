package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] v = new int[50];
        int[] p = new int[20];
        LibStrings.generadorAleatorio(v, -100, 100);
        LibStrings.generadorAleatorio(p, -100, 100);
        int[][] matriz = multiplicacionDePosicionesParaMatriz(v, p);
        System.out.println(matrizToString(matriz));
    }

    public static int[][] multiplicacionDePosicionesParaMatriz(int[] array1, int[] array2) {
        int[][] matriz = new int[array1.length][array2.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                matriz[i][j] = array1[i] * array2[j];
            }
        }
        return matriz;
    }

    /**
     * @param matriz matriz lla rellenada
     * @return devuelve un {@link String String} con la patriz para ser imprimible
     */
    public static String matrizToString(int[][] matriz) {
        StringBuilder builder = new StringBuilder();
        final int LONGITUD = longitudMaximaLongitudEnMatriz(matriz);
        for (int[] array : matriz) {
            for (int valor : array) {
                builder.append(String.format("%-" + LONGITUD + "d  ", valor));
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * @param matriz Matriz de tipo {@link Integer int} del que desea saber la longitud
     * @return Devuelve la longitud maxima de una matriz
     */
    public static int longitudMaximaLongitudEnMatriz(int[][] matriz) {
        int longitudMaxima = 0;
        int valor;
        for (int[] array : matriz) {
            for (int numero : array) {
                valor = String.valueOf(numero).length();
                if (valor > longitudMaxima) {
                    longitudMaxima = valor;
                }
            }
        }
        return longitudMaxima;
    }

}
