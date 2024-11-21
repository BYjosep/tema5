package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class Ejercicio12 {

    public static void main(String[] args) {
        int[] v = new int[50];
        int[] p;
        LibStrings.generadorAleatorio(v, 0, 7897);

        p = sumaDeNumeros(v);
        System.out.println("Array v");
        System.out.println(Arrays.toString(v));
        System.out.println("\n\nArray p");
        System.out.println(Arrays.toString(p));
    }

    /**
     * @param array array que deseausar
     * @return retorna un array que retorna un array que
     * suma exponencialmente
     */
    public static int[] sumaDeNumeros(int[] array) {
        if (array == null) {
            return null;
        }
        int[] suma = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                suma[i] = array[i];
            } else {
                suma[i] = array[i] + suma[i - 1];
            }
        }
        return suma;
    }
}
