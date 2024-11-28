package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio1 {
    public static void main(String[] args) {
        float[][] matriz;

        int filas = LibStrings.ingresarUnNumero("Ingrese el número de filas que desea", 1);
        int columnas = LibStrings.ingresarUnNumero("Ingrese el numero de columnas que desea", 1);
        matriz = new float[filas][columnas];

        rellenarMatrizManualmente(matriz);
        System.out.println(matrizToString(matriz));
    }

    /**
     * Este metodo sirve para rellenar la matriz de forma manual
     *
     * @param matriz matriz a rellenar
     */
    public static void rellenarMatrizManualmente(float[][] matriz) {
        final int OPERACION = 10_000;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                float valor = LibStrings.ingresarUnNumeroF("Ingrese un numero para la fila " + i + " y la columna " + j);
                int aux = (int) (valor * OPERACION);
                valor = (float) aux / OPERACION;
                matriz[i][j] = valor;
            }
        }

    }

    /**
     *
     * @param matriz matriz lla rellenada
     * @return devuelve un {@link String String} con la patriz para ser imprimible
     */
    public static String matrizToString(float[][] matriz) {
        StringBuilder builder = new StringBuilder();
        final int LONGITUD = maximaLongitud(matriz);
        for (float[] floats : matriz) {
            for (float valor : floats) {
                builder.append(String.format("%-" + LONGITUD + ".4f    ", valor));
            }
            builder.append("\n");
        }
        return builder.toString();
    }


    /**
     *
     * @param matriz matriz lla rellenado
     * @return devuelve la longitud mas larga para poder dar un buen formato
     */
    private static int maximaLongitud(float[][] matriz) {

        int longitud = 0;
        for (float[] floats : matriz) {
            for (float valor : floats) {
                if (longitud < String.valueOf(valor).length()) {
                    longitud = String.valueOf(valor).length();
                }
            }
        }
        return longitud;
    }
}
