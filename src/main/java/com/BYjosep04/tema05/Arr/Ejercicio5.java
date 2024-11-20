package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio5 {
    public static void main(String[] args) {
        int capacidad;
        float[] estatura;
        float media;
        capacidad = LibStrings.ingresarUnNumero("Ingrese la capacidad de personas que desea introducir", 1);
        estatura = new float[capacidad];
        pedirEstatura(estatura);
        media = LibStrings.mediaDeNumerosEnArray(estatura);
        System.out.println("La media es: " + media);
        System.out.println(quienSuperaLaMedia(estatura, media));

    }


    /**
     * @param estatura array de estatura de tipo float
     */
    public static void pedirEstatura(float[] estatura) {
        for (int i = 0; i < estatura.length; i++) {

            estatura[i] = LibStrings.ingresarUnNumeroF("Ingrese la estatura de la persona " + i, 0);
        }
    }


    public static String quienSuperaLaMedia(float[] estatura, float media) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < estatura.length; i++) {
            if (estatura[i] > media) {
                sb.append("La persona " + i + " tiene la estatura: " + estatura[i] + "\n");
            }
        }
        return sb.toString();
    }

}
