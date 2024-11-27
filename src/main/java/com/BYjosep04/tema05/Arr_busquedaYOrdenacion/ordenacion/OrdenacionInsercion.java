package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.ordenacion;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class OrdenacionInsercion {
    public static void main(String[] args) {
        int[] array = new int[10];
        LibStrings.generadorAleatorio(array, 0, 100);

        // Imprimir array original
        System.out.println("Array original: " + Arrays.toString(array));

        // Ordenar el array
        ordenacionInsercion(array);

        // Imprimir array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }


    /**
     * Ordena un array de enteros mediante el método de inserción.
     * <p>
     * Recorre el array desde el segundo elemento, colocando cada elemento
     * en su posición correcta entre los elementos anteriores.
     *
     * @param array Array de enteros a ordenar (modificado in-place)
     */
    public static void ordenacionInsercion(int[] array) {
        // Recorremos desde el segundo elemento hasta el final
        for (int i = 1; i < array.length; i++) {
            // Elemento actual a insertar
            int elementoActual = array[i];

            // Posición donde se insertará el elemento
            int j = i - 1;

            // Desplazar elementos mayores hacia la derecha
            while (j >= 0 && array[j] > elementoActual) {
                array[j + 1] = array[j];
                j--;
            }

            // Insertar el elemento en su posición correcta
            array[j + 1] = elementoActual;
        }
    }
}
