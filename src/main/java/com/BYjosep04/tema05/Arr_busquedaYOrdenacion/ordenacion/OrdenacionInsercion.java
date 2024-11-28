package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.ordenacion;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class OrdenacionInsercion {
    public static void main(String[] args) {
        int[] array = new int[10];
        LibStrings.generadorAleatorio(array, 0, 10);

        // Imprimir array original
        System.out.println("Array original: " + Arrays.toString(array));

        // Ordenar el array
        ordenacionInsercion(array);

        // Imprimir array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }



    public static void ordenacionInsercion(int[] array) {
        int aux;
        for (int i = 1; i < array.length; i++) {
            int j;
            aux = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > aux) {
                    array[j + 1] = array[j];
                    array[j] = aux;
                } else if (array[j] < aux) {
                    break;
                }
            }
            array[j + 1] = aux;
        }

    }
}
