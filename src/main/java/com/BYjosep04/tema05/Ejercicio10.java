package com.BYjosep04.tema05;

import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio10 {
    public static void main(String[] args) {
        String frase = libStrings.ingresarFrase();
        System.out.println(palabraPalindromaEnFrase(frase));
    }


    /**
     *
     * @param frase Ingrese una frase en formato {@link String String}
     * @return devuelve un {@link String String} diciendo si en la
     * frase hay una palabra palíndroma o no y en caso de ser afirmativo
     * dice cual es la palabra
     */
    public static String palabraPalindromaEnFrase(String frase) {
        String[] array = frase.split("\\s+|\n|,");
        String palabra;
        int distancia = 1;
        String palindroma = "";
        char c1, c2;

        for (int i = 0; i < array.length; i++) {
            distancia = 0;
            palabra = array[i];

            for (int j = 0; j < palabra.length() / 2; j++) {
                c1 = palabra.charAt(j);
                c2 = palabra.charAt(palabra.length() - 1 - j);
                if (c1 == c2) {
                    distancia = 0;
                } else {
                    distancia++;
                }
            }
            if (distancia == 0) {
                palindroma = "La frase tiene la palabra " + palabra + " como palíndroma";
                break;
            }
        }
        if (distancia != 0) {
            palindroma = "No hay ninguna palabra palíndroma";
        }
        return palindroma;
    }
}
