package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.ordenacion;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class ContingSort {
    public static void main(String[] args) {
        int[] array = new int[100];
        LibStrings.generadorAleatorio(array, 0, 100);
        System.out.println(Arrays.toString(array));
        contingSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void contingSort(int[] array) {
        final int DISTANCIA_MAXIMA = 10000;
        ArrayEstadisticas arrayEstadisticas = new ArrayEstadisticas(array);
        int min = arrayEstadisticas.getMin();
        int max = arrayEstadisticas.getMax();
        if (max - min > DISTANCIA_MAXIMA) {
            System.err.println("Hay dispersion en los datos");
            return;
        }
        int[] arrayConteo = new int[max + 1];
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            arrayConteo[array[i]]++;
        }

        for (int i = 0; i < arrayConteo.length; i++) {
            int cantidad = arrayConteo[i];
            for (int j = 0; j < cantidad; j++) {
                array[contador++] = i;
            }

        }
    }
}
