package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.busqueda;

import com.BYjosep04.tema05.lib.LibStrings;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] array = new int[100];
        int buscar;
        BusquedaLinealOrdenada.rellenarArray(array);
        buscar = LibStrings.ingresarUnNumero("Ingrese un numero minimo –10", -10);
        System.out.println(busquedaBinaria(array, buscar));
    }

    /**
     * Para este supuesto sé ha utilizado el mismo metodo de rellenar array que el de la
     * busqueda lineal ordenada, ya que si está desordenado este algoritmo de busqueda no funciona
     * @param array  array a del que desea buscar un número
     * @param buscar numer que se está buscando
     * @return Devuelve si el número se encuentra y en caso afirmativo también su posicio
     */
    public static String busquedaBinaria(int[] array, int buscar) {
        int medio;
        int primeraPosicion = 0;
        int ultimoPosicion = array.length - 1;
        String mensaje = "";
        boolean acabado = false;
        do {
            medio = (primeraPosicion + ultimoPosicion) / 2;
            if (array[medio] == buscar) {
                mensaje = "El número ha sido encontrado en la posicion " + medio;
                acabado = true;
            } else if (array[primeraPosicion] == buscar) {
                mensaje = "El número ha sido encontrado en la posicion " + primeraPosicion;
                acabado = true;
            } else if (array[ultimoPosicion] == buscar) {
                mensaje = "El número ha sido encontrado en la posicion " + ultimoPosicion;
                acabado = true;

            } else if (primeraPosicion >= ultimoPosicion) {
                mensaje = "No se ha encontrado el numero";
                acabado = true;
            } else if (array[medio] > buscar) {
                ultimoPosicion = medio - 1;
            } else if (array[medio] < buscar) {
                primeraPosicion = medio + 1;
            }

        } while (!acabado);
        return mensaje;
    }
}
