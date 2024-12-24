package com.BYjosep04.tema05.Str;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio16 {
    public static void main(String[] args) {
        int dni;
        dni = LibStrings.ingresarUnaOpcion("Ingrese el DNI", 0, 999999999);
        System.out.println(dni);
    }
    public static String dniToNif(int dni) {
        StringBuilder nif = new StringBuilder();
        String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto;
        resto = dni % 23;
        nif.append(dni);
        nif.append(letrasNif.charAt(resto-1));

        return nif.toString();
    }
}
