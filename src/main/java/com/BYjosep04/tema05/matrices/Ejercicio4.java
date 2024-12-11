package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int FILAS = 4, COLUMNAS = 8;
        int[][] matriz, matrizTranspuesta;

        matriz = rellenarMatrizDeAleatiriosInt(FILAS, COLUMNAS);
        System.out.println(matrizToString(matriz));

        matrizTranspuesta = crearMatrizTranspuesta(matriz);
        System.out.println(matrizToString(matrizTranspuesta));

        System.out.println(matrizConSuma(matriz));
        System.out.println(
                "El numero maximo de la matriz es:" + maximoDeUnaMatriz(matriz)
                        + "\nEl numero minimo de la  matriz es: " + miniomoDeUnaMatriz(matriz)
        );
        System.out.println("La media es: " + mediaDeUnaMatriz(matriz));
        System.out.println(verFilaYColumna(matriz));
    }

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

    public static String matrizToString(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int[] array : matriz) {
            for (int valor : array) {
                sb.append(valor).append("  ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static String matrizConSuma(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            sb.append("Fila ").append(i).append(" ");
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sb.append(matriz[i][j]).append(" ");
                suma += matriz[i][j];

            }
            sb.append("     Tiene como Suma: ").append(suma).append("\n");
        }
        return sb.toString();
    }

    public static int maximoDeUnaMatriz(int[][] matriz) {
        int maximo = Integer.MIN_VALUE;
        for (int[] array : matriz) {
            for (int numero : array) {
                if (numero > maximo) {
                    maximo = numero;
                }
            }

        }
        return maximo;
    }

    public static int miniomoDeUnaMatriz(int[][] matriz) {
        int minimo = Integer.MAX_VALUE;
        for (int[] array : matriz) {
            for (int numero : array) {
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        }
        return minimo;
    }

    public static int mediaDeUnaMatriz(int[][] matriz) {
        int media;
        int suma = 0;
        int cantidad = 0;
        for (int[] array : matriz) {
            for (int numero : array) {
                suma += numero;
                cantidad++;
            }
        }
        media = suma / cantidad;

        return media;
    }

    public static int verFilaYColumna(int[][] matriz) {
        int numero, fila, columna;
        fila = LibStrings.ingresarUnaOpcion("Ingresa una fila(0-" + (matriz.length - 1) + ")", 0, (matriz.length - 1));
        columna = LibStrings.ingresarUnaOpcion("Ingresa una columna(0-" + (matriz[0].length - 1) + ")", 0, (matriz[0].length - 1));

        numero = matriz[fila][columna];
        return numero;
    }
}
