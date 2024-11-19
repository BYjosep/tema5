package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.libStrings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        char[] caracteres = new char[10];

        introducirCaracterEnArray(caracteres);

        System.out.println("La cadena es: " + Arrays.toString(caracteres));
        System.out.println("La cadena con las posiciones impares repetidas son: "
                + repetirCaracterImparDeArray(caracteres));

    }


    /**
     * Ingresar caracteres en un array
     *
     * @param caracteres {@link  Array array} que desea modificar
     */
    public static void introducirCaracterEnArray(char[] caracteres) {

        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = libStrings.ingresarUnCaracter("Ingresa un caracter");
        }
    }


    /**
     * @param caracteres Ingresa el {@link Array array} de tipo {@link Character char}
     * @return Devuelve un {@link String String} con la cadena de caracteres
     * con las posiciones impares cuponiendo que la posicion inicial es 0
     */
    public static String repetirCaracterImparDeArray(char[] caracteres) {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < caracteres.length; i++) {
            if (i % 2 != 0) {
                cadena.append(caracteres[i]);
                cadena.append(caracteres[i]);
            } else {
                cadena.append(caracteres[i]);
            }
        }
        return cadena.toString();
    }


}
