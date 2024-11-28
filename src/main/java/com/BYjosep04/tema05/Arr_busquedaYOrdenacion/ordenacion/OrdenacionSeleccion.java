package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.ordenacion;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class OrdenacionSeleccion {
    public static void main(String[] args) {
        int[] array = new int[10];
        LibStrings.generadorAleatorio(array, 0, 100);

        System.out.println("Array original: " + Arrays.toString(array));

        ordenacionSeleccion(array);

        System.out.println("Array ordenado: " + Arrays.toString(array));
    }


    public static void ordenacionSeleccion(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int posicion = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    posicion = array[j];
                }

            }
            if (min < array[i]) {


            }
        }
    }
}
