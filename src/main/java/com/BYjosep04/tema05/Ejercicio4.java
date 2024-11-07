package com.BYjosep04.tema05;

import com.BYjosep04.tema05.lib.libStrings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresre una frase:");
        sb.append(scanner.nextLine());
        System.out.println(contadorVocalesConsonantesPorPalabras(String.valueOf(sb)));
        scanner.close();
    }


    /**
     * Ingrese un mensaje y devuelve la cantidad de vocales y consonantes
     * de cada palabra
     *
     * @param mensaje Inserte el mensaje en formato {@link String String}
     * @return devuelve el valor en formato {@link StringBuilder StringBuilder}
     */
    public static StringBuilder contadorVocalesConsonantesPorPalabras(String mensaje) {
        StringBuilder mensajeEntregado = new StringBuilder();
        String[] array;
        array = mensaje.split("\\s|\n|,");


        for (int i = 0; i < mensaje.split("\\s|\n|,").length; i++) {
            mensajeEntregado.append("La palabra ").append(i + 1).append(" tiene ").append(libStrings.cantidadVocalesYConsonantes(array[i])).append(".\n");

        }


        return mensajeEntregado;
    }
}
