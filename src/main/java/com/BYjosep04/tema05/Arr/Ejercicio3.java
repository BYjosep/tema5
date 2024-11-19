package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.libStrings;

import java.lang.reflect.Array;

public class Ejercicio3 {
    public static void main(String[] args) {
        float[] numeros = new float[20];
        libStrings.introducirFloatEnArray(numeros);
        System.out.println(tablaDeNumeros(numeros));
    }


    /**
     * @param numeros array que desea crear una tabla de 4x(n)columnos
     *                este {@link Array array} es de tipo {@link Float float}
     * @return devuelve un {@link String String} con la cadena de caracteres
     */
    public static String tablaDeNumeros(float[] numeros) {
        int inicio = 0;
        int aux = 4;
        StringBuilder sb = new StringBuilder();

        do {
            for (int i = inicio; i < aux; i++) {
                sb.append(numeros[i]).append(" ");
            }
            sb.append("\n");
            inicio = aux;
            aux += 4;

        } while (numeros.length != inicio);

        return sb.toString();
    }
}
