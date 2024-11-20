package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio8 {
    public static void main(String[] args) {
      float[] numeros = new float[100];
      float numeroABuscar;
      numeroABuscar= LibStrings.ingresarUnNumeroF("Ingrese el numero a buscar");
        System.out.println(buscarNumeroEnArray(numeros, numeroABuscar));
    }

    public static String buscarNumeroEnArray(float[] array, float numeroABuscar) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("El restado aparece en la posicion: ");
        int fraseInicial =resultado.length();
        for (int i = 0; i < array.length; i++) {
            if (i == numeroABuscar) {
                resultado.append(array[i]).append(" ");
            }
        }

        if (resultado.length() == fraseInicial) {
            resultado.delete(0, fraseInicial);
            resultado.append("El número no se encuentra en el array");
        }

        return resultado.toString();
    }

}
