package com.BYjosep04.tema05.Str;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = scanner.nextLine();

        System.out.println(contadorLetrasPorPalabra(frase));
    }

    /**
     * @param frase frase en formato {@link  String String}
     * @return Devuelve un {@link  String String} con una tabla por palabras con el respectivo
     * numero de letras por palabras
     */
    public static String contadorLetrasPorPalabra(String frase) {
        StringBuilder sb = new StringBuilder();
        String palabra = "";
        frase = frase.trim();
        String[] array = frase.split("\\s+|\n|,");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > palabra.length()) {
                palabra = array[i];
            }
        }
        int palabraMasLarga = palabra.length();
        sb.append(String.format("|| %-" + (palabraMasLarga + 3) + "s||%" + (palabraMasLarga + 3) + "s ||", "palabras", "letras")).append("\n");
        for (int i = 0; i < array.length; i++) {
            int numero = array[i].length();
            sb.append(String.format("|| %-" + (palabraMasLarga + 3) + "s||%" + (palabraMasLarga + 3) + "d ||", array[i], numero)).append("\n");
        }
        return sb.toString();
    }
}
