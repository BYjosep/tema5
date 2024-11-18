package com.BYjosep04.tema05.Str;


import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio18 {

    public static void main(String[] args) {

        String fechaNacimiento;

        fechaNacimiento = libStrings.ingresarTexto("Introduce tu fecha de nacimiento (formato dd-mm-aaaa)");

        if (esFormatoValido(fechaNacimiento)) {
            int luckyNumber = calcularLuckyNumber(fechaNacimiento);
            System.out.println("Tu número de la suerte es: " + luckyNumber);
        } else {
            System.out.println("La fecha introducida no tiene el formato válido (dd-mm-aaaa).");
        }


    }

    /**
     * Comprueba si una fecha tiene el formato válido "dd-mm-aaaa".
     *
     * @param fecha La fecha como cadena.
     * @return true si el formato es válido; false en caso contrario.
     */
    private static boolean esFormatoValido(String fecha) {
        return fecha.matches("\\d{2}-\\d{2}-\\d{4}");
    }

    /**
     * Calcula el número de la suerte a partir de una fecha de nacimiento.
     *
     * @param fecha La fecha de nacimiento en formato dd-mm-aaaa.
     * @return El número de la suerte como un entero.
     */
    private static int calcularLuckyNumber(String fecha) {
        // Eliminar guiones para obtener solo los dígitos
        String digitos = fecha.replace("-", "");

        // Sumar los dígitos de forma iterativa
        int suma = sumarDigitos(digitos);

        // Reducir la suma a un solo dígito
        while (suma >= 10) {
            suma = sumarDigitos(String.valueOf(suma));
        }

        return suma;
    }

    /**
     * Suma los dígitos de una cadena de caracteres.
     *
     * @param digitos Una cadena de dígitos.
     * @return La suma de los dígitos.
     */
    private static int sumarDigitos(String digitos) {
        int suma = 0;
        for (char c : digitos.toCharArray()) {
            suma += Character.getNumericValue(c);
        }
        return suma;
    }
}
