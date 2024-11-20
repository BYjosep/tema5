package com.BYjosep04.tema05.Str;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio15 {
    public static void main(String[] args) {
        char caracter = LibStrings.ingresarUnCaracter("Ingrese un caracter");
        int columna = LibStrings.ingresarUnNumero("Ingrese la columna");
        int fila = LibStrings.ingresarUnNumero("Ingrese la fila");
        System.out.println(matrizDeUnCaracter(caracter, columna, fila));
    }


    /**
     *
     * @param caracter El caracter que se desea usar
     * @param columna El numero de columnas que se desea usar
     * @param fila El número de filas que desea usar
     * @return Devuelve un {@link String String} con la tabla deseada
     */
    public static String matrizDeUnCaracter(char caracter, int columna, int fila) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                sb.append(caracter);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
