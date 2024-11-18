package com.BYjosep04.tema05.Str;

import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio13 {
    public static void main(String[] args) {

        String salida = "";
        int opcion;
        do {
            opcion = libStrings.ingresarOpcin("MENU PRINCIPAL \n" +
                    "==============\n" +
                    "1. Palabra más larga.\n" +
                    "2. Palabra más corta.\n" +
                    "3. Número de vocales.\n" +
                    "------------------------------------\n" +
                    "0. Salir\n");

            switch (opcion) {
                case 1 -> {
                    salida = palabraMasLarga();
                }
                case 2 -> {
                    salida = palabraMasCorta();
                }
                case 3 -> {
                    salida = numerosDeVocales();
                }
                default -> {
                    salida = "";
                }
            }
            System.out.println(salida);

        } while (opcion != 0);
    }


    /**
     * @return Devuelve la palabra mas larga
     */
    public static String palabraMasLarga() {
        String palabra1, palabra2, palabra3;
        String mensaje = "La palabra mas larga es: ";
        palabra1 = libStrings.ingresarTexto("Ingrese la primer palabra: ");
        palabra2 = libStrings.ingresarTexto("Ingrese la segundo palabra: ");
        palabra3 = libStrings.ingresarTexto("Ingrese la tercera palabra: ");

        int p1 = palabra1.length();
        int p2 = palabra2.length();
        int p3 = palabra3.length();

        if (p1 > p2 && p1 > p3) {
            return mensaje + palabra1;
        } else if (p2 > p1 && p2 > p3) {
            return mensaje + palabra2;
        } else {
            return mensaje + palabra3;
        }

    }


    /**
     * @return Devuelve la palabra mas corta
     */
    public static String palabraMasCorta() {
        String palabra1, palabra2, palabra3;
        String mensaje = "La palabra mas corta es: ";
        palabra1 = libStrings.ingresarTexto("Ingrese la primer palabra: ");
        palabra2 = libStrings.ingresarTexto("Ingrese la segundo palabra: ");
        palabra3 = libStrings.ingresarTexto("Ingrese la tercera palabra: ");

        int p1 = palabra1.length();
        int p2 = palabra2.length();
        int p3 = palabra3.length();

        if (p1 < p2 && p1 < p3) {
            return mensaje + palabra1;
        } else if (p2 < p1 && p2 < p3) {
            return mensaje + palabra2;
        } else {
            return mensaje + palabra3;
        }

    }


    /**
     * @return devuelve el numero de vocales en formato {@link  String String}
     */
    public static String numerosDeVocales() {
        int vocales = 0;
        String frase = libStrings.ingresarFrase();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a', 'á', 'à', 'ä', 'e', 'è', 'é', 'ë', 'i', 'ì', 'í', 'ï',
                     'o', 'ó', 'ò', 'ö', 'u', 'ù', 'ú', 'ü' -> vocales += 1;
            }
        }
        return "Hay " + vocales + " vocales";
    }
}
