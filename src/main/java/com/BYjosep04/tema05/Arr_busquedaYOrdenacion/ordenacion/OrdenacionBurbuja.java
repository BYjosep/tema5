package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.ordenacion;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class OrdenacionBurbuja {
    public static void main(String[] args) {
        int[] array = new int[100];
        LibStrings.generadorAleatorio(array, -10000, 10000);

        ordenacionBurbuja(array);
        System.out.println(Arrays.toString(array));
    }

    public static void ordenacionBurbuja(int[] array) {
        int ini = 0;
        int fin = ini + 1;
        int aux;
        while (ini < array.length - 1) {

            while (fin <= array.length - 1) {
                if (array[ini] >= array[fin]) {
                    aux = array[ini];
                    array[ini] = array[fin];
                    array[fin] = aux;
                }
                fin++;
            }
            ini++;
            fin = ini + 1;
        }
    }

}
