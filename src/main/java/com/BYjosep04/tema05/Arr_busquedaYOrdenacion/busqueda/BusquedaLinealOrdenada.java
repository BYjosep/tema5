package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.busqueda;

import com.BYjosep04.tema05.lib.LibStrings;

import java.util.Random;

/**
 * Para este ejercicio, ya que es ordenada se rellenara con un bucle que
 * vaya desde un número n hasta n+longitud
 */
public class BusquedaLinealOrdenada {
    public static void main(String[] args) {
        int[] array = new int[100];
        int buscar;
        rellenarArray(array);
        buscar = LibStrings.ingresarUnNumero("Ingrese un numero minimo –10 ", -10);
        System.out.println(BusquedaLinealNoOrdenado.busquedaLineal(array, buscar));
    }


    /**
     * Para este ejercicio he puesto como semilla 100,
     * para que este valor cambiara es recomendable no poner una semilla
     *
     * @param array array a rellenar
     */
    public static void rellenarArray(int[] array) {
        Random random = new Random(100);
        int valor = random.nextInt(-10, 100);
        for (int i = 0; i < array.length; i++) {
            array[i] = valor++;
        }
        /*
        Este sout ha sido puesto para hacer pruebas en la busqueda y
        no tener que depender de estar probando numeros al azar
        System.out.println(Arrays.toString(array));
         */
    }
}
