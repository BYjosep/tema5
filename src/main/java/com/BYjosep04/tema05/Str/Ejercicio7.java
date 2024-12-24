package com.BYjosep04.tema05.Str;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String frase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = scanner.nextLine();
        System.out.println(separadorPalabrasPorLineas(frase));
    }

    /**
     * @param frase Ingrese el texto en formato {@link String String}
     * @return Devuelve la frase pero cada palabra esta separada por un salto de linea
     */
    public static String separadorPalabrasPorLineas(String frase) {
        StringBuilder sb = new StringBuilder();
        String entrega;
        String[] array = frase.split("\\s+|\n|,");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append("\n");
        }
        entrega = sb.toString();
        return entrega;
    }
}
