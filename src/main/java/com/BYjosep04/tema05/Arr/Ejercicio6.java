package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] suma = new int[10];
        float[] division = new float[10];
        String sumaString, divisionString;
        LibStrings.generadorAleatorio(a, 1, 10);
        LibStrings.generadorAleatorio(b, 1, 10);
        sumaDeArrays(a, b, suma);
        divisionDeArrays(a, b, division);
        sumaString = Arrays.toString(suma);
        divisionString = Arrays.toString(division);
        System.out.println("Array a\n" + Arrays.toString(a));
        System.out.println("Array b\n" + Arrays.toString(b));
        System.out.println("La suma de los elementos de los arrays es: " + sumaString);
        System.out.println("La division de los elementos de los arrays es: " + divisionString);
    }

    /**
     * @param array1         primer array
     * @param array2         segundo array
     * @param arrayResultado array donde se hace la suma final
     */
    public static void sumaDeArrays(int[] array1, int[] array2, int[] arrayResultado) {
        for (int i = 0; i < arrayResultado.length; i++) {
            arrayResultado[i] = array1[i] + array2[i];
        }
    }


    public static void divisionDeArrays(int[] array1, int[] array2, float[] arrayResultado) {
        for (int i = 0; i < arrayResultado.length; i++) {
            arrayResultado[i] = (float) array1[i] / (float) array2[i];
        }
    }
}
