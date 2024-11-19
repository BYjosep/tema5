package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio3 {
    public static void main(String[] args) {
        float[] numeros = new float[20];
        libStrings.introducirFloatEnArray(numeros);
        System.out.println(tablaDeNumeros(numeros));
    }

    public static String tablaDeNumeros(float[] numeros) {

        StringBuilder sb = new StringBuilder();
        int j = 0;

        do {
            for (int i = 0; i < 5; i++) {
                sb.append(numeros[i]).append(" ");
            }
            sb.append("\n");
        } while (numeros.length != j);

        return sb.toString();
    }
}
