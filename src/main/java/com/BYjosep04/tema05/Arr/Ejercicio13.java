package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] v = new int[50];
        int[] p;
        LibStrings.generadorAleatorio(v, -1000, 1000);
        if (paresDeArrayEnArray(v) == null) {
            System.err.println("No hay pares");
        } else {
            p = paresDeArrayEnArray(v);
            System.out.println(Arrays.toString(p));
        }


    }


    /**
     * @param array array que desea comprobar
     * @return Devuelve array con los numeros pares en caso de que exista
     */
    public static int[] paresDeArrayEnArray(int[] array) {
        int catidadPares = pares(array);
        if (catidadPares == 0) {
            return null;
        }
        int[] p = new int[catidadPares];

        int posicion = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                p[posicion] = i;
                posicion++;
            }
        }
        return p;
    }


    /**
     * @param array array del que desea contar los pares
     * @return devuelve un {@link Integer int} con el numero de pares
     */
    public static int pares(int[] array) {
        if (array == null) {
            return 0;
        }
        int pares = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}
