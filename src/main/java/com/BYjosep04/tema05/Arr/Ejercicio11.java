package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] v = new int[10];
        int[] p;
        LibStrings.generadorAleatorio(v, Integer.MIN_VALUE, Integer.MAX_VALUE - 1);
        p = invertirOrdenDeArray(v);

        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(p));
    }

    public static int[] invertirOrdenDeArray(int[] array) {
        if (array == null) {
            return null;
        }
        int cantidad = array.length - 1;
        int[] retorno = new int[array.length];
        for (int i : array) {
            retorno[cantidad] = i;
            cantidad--;
        }
        return retorno;
    }
}
