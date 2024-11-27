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


    /**
     * Ordena un array de enteros mediante el método de selección.
     * <p>
     * El método busca repetidamente el elemento más pequeño y lo coloca
     * en la posición correspondiente, ordenando el array de menor a mayor.
     *
     * @param array Array de enteros a ordenar (modificado in-place)
     */
    public static void ordenacionSeleccion(int[] array) {
        // Recorremos el array desde la primera hasta la penúltima posición
        for (int i = 0; i < array.length - 1; i++) {
            // Asumimos que el elemento actual es el mínimo
            int indiceMenor = i;
            // Buscamos el elemento más pequeño en el resto del array
            for (int j = i + 1; j < array.length; j++) {
                // Si encontramos un elemento menor, actualizamos el índice del menor
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // Si el mínimo no está en su posición, intercambiamos
            if (indiceMenor != i) {
                int temp = array[i];
                array[i] = array[indiceMenor];
                array[indiceMenor] = temp;
            }
        }
    }
}
