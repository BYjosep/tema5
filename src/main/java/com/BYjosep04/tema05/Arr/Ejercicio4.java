package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        double mediaTotal;
        double[] array = new double[30];

        generadorAleatorio(array, 1, 10);


        double media5 = LibStrings.mediaDeNumerosEnArray(array, 5);
        mediaTotal = LibStrings.mediaDeNumerosEnArray(array);

        System.out.println(formatarArray(array));
        System.out.println("La media de numeros iguales o superiores a 5 es: " + media5);
        System.out.println("La media total es: " + mediaTotal);
    }

    /**
     * @param array genera número aleatorio dentro de un {@link java.util.Arrays array} de
     *              n numeros de formato {@link Double double}
     */
    public static void generadorAleatorio(double[] array, double min, double max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (max - min) * random.nextDouble();
            //array[i] = random.nextDouble(1, 10.0);
        }

    }

    /**
     * @param array arrary
     * @return Devuelve un {@link String String} con el array formateado con la estrucctura
     * append(El valor de la posicion (i) es: array[i] \n
     */
    public static String formatarArray(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("El valor de la posicion ").append(i).append(" es: ").append(array[i]).append("\n");

        }
        return sb.toString();
    }

}
