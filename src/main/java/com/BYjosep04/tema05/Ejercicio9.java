package com.BYjosep04.tema05;

import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio9 {
    public static void main(String[] args) {
        String frase = libStrings.ingresarFrase();
        System.out.println(fraseEnPosicionImpar(frase));

    }

    /**
     *
     * @param frase Ingresa un texto en formato {@link String String}
     * @return Devuelve el texto en formato {@link String String} solo con
     * las posiciones impares
     */
    public static String fraseEnPosicionImpar(String frase){
        int largo = frase.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <largo ; i++) {
            sb.append(frase.charAt(i));

            i++;
        }
        return sb.toString();
    }
}
