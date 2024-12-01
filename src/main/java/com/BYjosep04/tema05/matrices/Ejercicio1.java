package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[][] matriz;

        int filas = LibStrings.ingresarUnNumero("Ingrese el número de filas que desea", 1);
        int columnas = LibStrings.ingresarUnNumero("Ingrese el numero de columnas que desea", 1);
        matriz = new double[filas][columnas];

        rellenarMatrizManualmente(matriz);
        System.out.println(matrizToString(matriz));
    }

    /**
     * Este metodo sirve para rellenar la matriz de forma manual
     *
     * @param matriz matriz a rellenar
     */
    public static void rellenarMatrizManualmente(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                double valor = LibStrings.ingresarUnNumeroF("Ingrese un numero para la fila " + i + " y la columna " + j);

                matriz[i][j] = valor;
            }
        }

    }

    /**
     *
     * @param matriz matriz lla rellenada
     * @return devuelve un {@link String String} con la patriz para ser imprimible
     */
    public static String matrizToString(double[][] matriz) {
        final int DECIMALES = 4;
        StringBuilder builder = new StringBuilder();
        final int LONGITUD = maximaLongitudEnMatriz(matriz, DECIMALES);
        for (double[] floats : matriz) {
            for (double valor : floats) {
                builder.append(String.format("%-" + LONGITUD + "." + DECIMALES + "f    ", valor));
            }
            builder.append("\n");
        }
        return builder.toString();
    }


    /**
     *
     * @param matriz matriz lla rellenado
     * @return devuelve la longitud más larga para poder dar un buen formato
     */
    private static int maximaLongitudEnMatriz(double[][] matriz, int decimales) {

        int longitud = 0;
        for (double[] fila : matriz) {
            if (longitud < determinarLongitudMaxima(fila, decimales)) {
                longitud = determinarLongitudMaxima(fila, decimales);
            }
        }
        return longitud;
    }


    public static int determinarLongitudMaxima(double[] array, int decimales) {
        int longitudMaxima = 0;
        String formato = "%." + decimales + "f";
        for (double numero : array) {
            int longitudActual = String.format(formato, numero).length();
            if (longitudMaxima < longitudActual) {
                longitudMaxima = longitudActual;
            }
        }
        return longitudMaxima;
    }
}
