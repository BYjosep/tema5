package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio8 {
    public static void main(String[] args) {
      int[] numeros = new int[100];
      int numeroABuscar;
      LibStrings.generadorAleatorio(numeros, Integer.MIN_VALUE, Integer.MAX_VALUE);
        numeroABuscar = LibStrings.ingresarUnaOpcion("Ingrese el numero a buscar");
        System.out.println(buscarNumeroEnArray(numeros, numeroABuscar));
    }

    /**
     *
     * @param array array que desea pasar
     * @param numeroABuscar número que desea buscar
     * @return Devuelve un {@link String String} con el mensaje de si ha
     * encontrado el numero en el array y en caso afirmativo en las posiciones en las que se encuentra
     */
    public static String buscarNumeroEnArray(int[] array, int numeroABuscar) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("El restado aparece en la posicion: ");
        int fraseInicial =resultado.length();
        for (int j : array) {
            if (j == numeroABuscar) {
                resultado.append(j).append(" ");
            }
        }

        if (resultado.length() == fraseInicial) {
            resultado.delete(0, fraseInicial);
            resultado.append("El número no se encuentra en el array");
        }

        return resultado.toString();
    }

}
