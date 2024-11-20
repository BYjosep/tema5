package com.BYjosep04.tema05.Str;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio9 {
    public static void main(String[] args) {
        String frase = LibStrings.ingresarFrase();
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
        for (int i = 0; i <largo ; i+=2) {
            sb.append(frase.charAt(i));

        }
        return sb.toString();
    }
}
