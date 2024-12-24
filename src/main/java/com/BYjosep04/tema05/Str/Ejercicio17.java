package com.BYjosep04.tema05.Str;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio17 {

    // Cadena con las letras en el orden correspondiente al cálculo
    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static void main(String[] args) {
        String nif;

        nif = LibStrings.ingresarTexto("Introduce el NIF (formato: 12345678Z): ");
        nif = nif.toUpperCase();

        if (validateNIF(nif)) {
            System.out.println("El NIF es válido.");
        } else {
            System.out.println("El NIF es inválido.");
        }


    }

    /**
     * Valida si un NIF es correcto.
     *
     * @param nif El NIF a validar.
     * @return true si el NIF es válido; false en caso contrario.
     */
    public static boolean validateNIF(String nif) {
        // Validar longitud y formato
        if (nif == null || nif.length() != 9) {
            return false;
        }

        // Extraer número y letra
        String numberPart = nif.substring(0, 8);
        char letterPart = nif.charAt(8);

        // Validar que los primeros 8 caracteres son dígitos
        if (!numberPart.matches("\\d+")) {
            return false;
        }

        // Convertir la parte numérica a entero
        int number = Integer.parseInt(numberPart);

        // Calcular la letra correspondiente
        char expectedLetter = LETTERS.charAt(number % 23);

        // Comparar la letra esperada con la introducida
        return letterPart == expectedLetter;
    }


}
