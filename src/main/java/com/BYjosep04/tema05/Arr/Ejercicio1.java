package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.libStrings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        float[] numeros = new float[10];
        introducirNumerosEnArray(numeros);
        String resultado = Arrays.toString(numeros);
        System.out.println("El contenido del array es: " + resultado);
        System.out.println("La media del array es: " + mediaDeNumerosEnArray(numeros));
    }


    /**
     * @param numeros {@link  Array array} que desea modificar
     */
    public static void introducirNumerosEnArray(float[] numeros) {
        //float numero;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = libStrings.ingresarUnNumeroF("Ingresa un numero");
        }
    }


    /**
     * Ingrese un {@link  Array array} para calcular la media
     *
     * @param numeros Ingresa el {@link  Array array}
     * @return Devuelve {@link Float float}
     */
    public static float mediaDeNumerosEnArray(float[] numeros) {
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma / numeros.length;

    }

}
