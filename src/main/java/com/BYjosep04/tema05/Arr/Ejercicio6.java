package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        final int MAXIMO = 10;
        final int MINIMO = 1;
        int[] a = new int[10];
        int[] b = new int[10];
        int[] suma;
        float[] division ;
        String sumaString, divisionString;
        LibStrings.generadorAleatorio(a, MINIMO,MAXIMO );
        LibStrings.generadorAleatorio(b, MINIMO,MAXIMO);
        suma=sumaDeArrays(a, b);
        division = divisionDeArrays(a, b);
        sumaString = Arrays.toString(suma);
        divisionString = Arrays.toString(division);
        System.out.println("Array a\n" + Arrays.toString(a));
        System.out.println("Array b\n" + Arrays.toString(b));
        System.out.println("La suma de los elementos de los arrays es: " + sumaString);
        System.out.println("La division de los elementos de los arrays es: " + divisionString);
    }

    /**
     * @param array1 primer array
     * @param array2 segundo array
     */
    public static int[] sumaDeArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null;
        }
        int[] suma = new int[array1.length];
        for (int i = 0; i < suma.length; i++) {
            suma[i] = array1[i] + array2[i];
        }
        return suma;
    }


    public static float[] divisionDeArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null;
        }
        float[] division = new float[array1.length];
        for (int i = 0; i < division.length; i++) {
            division[i] = (float) array1[i] / (float) array2[i];
        }
        return division;
    }
}
