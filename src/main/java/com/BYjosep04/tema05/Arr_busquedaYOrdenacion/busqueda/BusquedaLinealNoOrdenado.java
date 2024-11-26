package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.busqueda;

import com.BYjosep04.tema05.lib.LibStrings;

public class BusquedaLinealNoOrdenado {
    public static void main(String[] args) {
        int[] array = new int[100];
        int buscar;
        LibStrings.generadorAleatorio(array, -1000, 1000);

        buscar = LibStrings.ingresarUnNumero("Ingrese un numero ha buscar");
        System.out.println(busquedaLinealNoOrdenada(array, buscar));
    }

    /**
     * @param array  array previamente ya rellenado
     * @param buscar número que desea buscar
     * @return devuelve un mensaje diciendo si ha encontrado el número o no
     * en caso de ser afirmativo indica la primera posicion (Ya que en caso de que sea encontrado rompera el
     * bucle y enviará el mensaje con que ha sido encontrado y su posicion)
     */
    public static String busquedaLinealNoOrdenada(int[] array, int buscar) {
        int posicion = -1;
        String mensaje;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscar) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            mensaje = "El numero no ha sido encontrado";
        } else {
            mensaje = "El número ha sido encontrado en la posicion " + posicion;
        }
        return mensaje;
    }
}
