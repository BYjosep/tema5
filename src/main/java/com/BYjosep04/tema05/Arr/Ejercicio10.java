package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;


public class Ejercicio10 {
    public static void main(String[] args) {
        int[] p = new int[10];
        int[] s;
        LibStrings.generadorAleatorio(p, Integer.MIN_VALUE, (Integer.MAX_VALUE - 1));
        Ejercicio9.visualizarArray(p);
        s = mayorA10(p);
        Ejercicio9.visualizarArray(s);
    }

    public static int[] mayorA10(int[] p) {
        int[] array = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            if (p[i] <= 10) {
                array[i] = -1;
            } else {
                array[i] = p[i];
            }

        }
        return array;
    }
}
