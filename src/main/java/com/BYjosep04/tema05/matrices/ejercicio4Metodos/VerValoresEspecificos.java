package com.BYjosep04.tema05.matrices.ejercicio4Metodos;

import com.BYjosep04.tema05.lib.LibStrings;

public class VerValoresEspecificos {


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

    public static int verUnaPosicion(int[][] matriz) {
        int numero, fila, columna;
        fila = LibStrings.ingresarUnaOpcion("Ingresa una fila(0-" + (matriz.length - 1) + ")", 0, (matriz.length - 1));
        columna = LibStrings.ingresarUnaOpcion("Ingresa una columna(0-" + (matriz[fila].length - 1) + ")", 0, (matriz[0].length - 1));

        numero = matriz[fila][columna];
        return numero;
    }
}
