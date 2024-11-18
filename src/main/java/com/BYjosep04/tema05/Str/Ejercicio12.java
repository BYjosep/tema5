package com.BYjosep04.tema05.Str;

import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio12 {
    public static void main(String[] args) {
        String texto = libStrings.ingresarFrase();

        System.out.println(sustituirPartesDeFrase(texto));
    }


    /**
     * @param texto Ingrese el texto En formato {@link String String}
     * @return
     */
    public static String sustituirPartesDeFrase(String texto) {
        texto = texto.replaceAll("es", "no por");
        texto = texto.replaceAll("\\d+", "*");
        return texto;
    }

}
