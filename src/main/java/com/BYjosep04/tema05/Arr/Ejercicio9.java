package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] array= new int[10];
        int opcion;
        LibStrings.generadorAleatorio(array, 0,50);
        do {
            opcion = LibStrings.ingresarUnNumero("""
                MENÚ PRINCIPAL
                ==============
                1.-Rellenar array.
                2.-Visualizar contenido del array
                3.-Visualizar contenido par.
                4.-Visualizar contenido múltiplo de 3
                0.-Salir del menú.
                Selecciona una opción:""",0,4);

            switch (opcion) {
                case 1 -> crearArray(array);
                case 2 -> visualizarArray(array);
                case 3 -> visualizarPares(array);
                case 4 -> visualizarMultiplos3(array);
                case 0 -> {
                }

            }
        } while (opcion != 0);

    }


    /**
     *
     * @param array genera o cambial los valores de un array con
     * una capacidad ya definida
     */
    public static void crearArray (int[] array) {
        LibStrings.generadorAleatorio(array, 0,50);
    }


    /**
     *
     * @param array visualiza el array
     */
    public static void visualizarArray (int[] array) {
        String arrayStr = Arrays.toString(array);
        System.out.println(arrayStr);
    }


    /**
     *
     * @param array visualiza las posiciones pares asumiendo de que la primera
     * posicion es 0
     */
    public static void visualizarPares(int[] array) {
        StringBuilder sb= new StringBuilder();
        sb.append("[");
        for (int j : array) {
            if (j % 2 == 0)
                sb.append(j).append(",");
        }
        String arrayStr = formatearArray(sb);

        System.out.println(arrayStr);
    }


    /**
     *
     * @param array visualiza los multiplos de 3
     */
    public static void visualizarMultiplos3(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0)
                sb.append("En la posicion ").append(i).append(" esta el numero; ").append(array[i]).append("\n");
        }

        System.out.println(sb);
    }


    /**
     * @param texto texto en formato {@link StringBuilder StringBuilder}
     *              para eliminar la última coma
     * @return Devuelve el texto formateado para array
     */
    public static String formatearArray(StringBuilder texto) {
        texto.delete(texto.length() - 1, texto.length());
        texto.append("]");
        return texto.toString();
    }
}
