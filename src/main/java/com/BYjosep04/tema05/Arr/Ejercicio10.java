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


    /**
     *
     * @param arrau array que desea copiar
     * @return devuelve él un array modificado mostrando los
     * valores iguales o menores a 10 como -1
     */
    public static int[] mayorA10(int[] arrau) {
        int[] arrayAux = new int[arrau.length];
        for (int i = 0; i < arrau.length; i++) {
            if (arrau[i] <= 10) {
                arrayAux[i] = -1;
            } else {
                arrayAux[i] = arrau[i];
            }

        }
        return arrayAux;
    }
}
