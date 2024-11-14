package com.BYjosep04.tema05;

import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio16 {
    public static void main(String[] args) {
        int dni;
        dni = libStrings.ingresarUnNumero("Ingrese el DNI" ,0 , 999999999);
        System.out.println(dni);
    }
    public static String dniToNif(int dni) {
        StringBuilder nif = new StringBuilder();
        String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto;
        resto = dni % 23;
        nif.append(dni).append(letrasNif.charAt(resto));

        return nif.toString();
    }
}
