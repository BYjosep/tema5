package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.ordenacion;

import com.BYjosep04.tema05.lib.LibStrings;

public class ContingSort {
    public static void main(String[] args) {
        int[] array = new int[100];
        LibStrings.generadorAleatorio(array, 0, 100);
        contingSort(array);
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
        for (int i = 0; i < array.length; i++) {
            arrayConteo[array[i]]++;
        }

        for (int i = 0; i < array.length; i++) {

        }
    }
}
