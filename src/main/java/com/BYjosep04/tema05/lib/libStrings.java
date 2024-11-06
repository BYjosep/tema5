package com.BYjosep04.tema05.lib;

public class libStrings {


    /**
     * Transforma el primer caracter en mayusculas
     * @param frase Introducir un String con la frase
     * @return Devuelve un String con la primera letra en mayuscula
     */
    public static String primeraLetraMayuscula(String frase){
        String mensajeModificado;
        String letra, resto;
        letra = String.valueOf(frase.charAt(0));
        letra = letra.toUpperCase();
        resto = frase.substring(1);

        mensajeModificado = letra+resto;

        return mensajeModificado;
    }
    /**
     * @param frase El parametro es un String
     * @return devuelve una frase con el numero de vocales y consonantes
     */
    public static String cantidadVocalesYConsonantes(String frase) {
        // variables
        int longitud;
        String resultado;
        int vocales, consonantes;
        vocales = 0;
        consonantes = 0;
        /*
         * Para evitar tener que poner mas letras en el swich
         * se han pasado todos los caracteres a minusculas
         */
        frase = frase.toLowerCase();
        longitud = frase.length();

        for (int i = 0; i < longitud; i++) {

            switch (frase.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> vocales += 1;
                case 'q', 'w', 'r', 't',
                     'y', 'p', 's', 'd',
                     'f', 'g', 'h', 'j',
                     'k', 'l', 'z', 'x',
                     'c', 'v', 'b', 'n', 'm' -> consonantes += 1;
            }
        }
        resultado = "El resultado ha sido de " + vocales + " vocales y " + consonantes + " consonates";
        return resultado;

    }

    /**
     *
     * @param mensaje Variable como {@link StringBuilder StringBuilder}
     * @return Devuelve un entero como valor
     */
    public static int contadorPalabras(StringBuilder mensaje){
        String mensajeStr = mensaje.toString();


        return  mensajeStr.split("\\s|\n|,").length;
    }

    /**
     *
     * @param mensaje Variable como {@link String String}
     * @return Devuelve un entero como valor
     */
    public static int contadorPalabras(String mensaje){


        return  mensaje.split("\\s|\n|,").length;
    }
}
