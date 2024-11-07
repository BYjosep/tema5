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
                     'c', 'v', 'b', 'n', 'm','ñ','ç' -> consonantes += 1;
            }
        }
        resultado =  vocales + " vocales y " + consonantes + " consonates";
        return resultado;

    }

    /**
     *
     * @param mensaje Variable como {@link StringBuilder StringBuilder}
     * @return Devuelve un entero como valor
     */
    public static int contadorPalabras(StringBuilder mensaje){
        String mensajeStr = mensaje.toString();
        mensajeStr = mensajeStr.trim();

        return  mensajeStr.split("\\s|\n").length;
    }

    /**
     *
     * @param mensaje Variable como {@link String String}
     * @return Devuelve un entero como valor
     */
    public static int contadorPalabras(String mensaje){
        mensaje = mensaje.trim();

        return  mensaje.split("\\s|\n").length;
    }


    /**
     * Ingrese un mensaje y devuelve la cantidad de vocales y consonantes
     * de cada palabra
     * @param mensaje Inserte el mensaje en formato {@link StringBuilder String}
     * @return devuelve el valor en formato {@link StringBuilder StringBuilder}
     */
    public static StringBuilder contadorVocalesConsonantesPorPalabras(StringBuilder mensaje){
        StringBuilder mensajeEntregado = new StringBuilder();
        String mensajeStr = mensaje.toString();
        String[] array = mensajeStr.split("\\s|\n|,");

        for (int i = 0; i < mensajeStr.split("\\s|\n|,").length; i++) {
            mensajeEntregado.append("La palabra ").append(i+1).append(" tiene ").append(libStrings.cantidadVocalesYConsonantes(array[i])).append(".\n");

        }

        return mensajeEntregado;
    }


    /**
     * Ingrese un mensaje y devuelve la cantidad de vocales y consonantes
     * de cada palabra
     * @param mensaje Inserte el mensaje en formato {@link String String}
     * @return devuelve el valor en formato {@link StringBuilder StringBuilder}
     */
    public static StringBuilder contadorVocalesConsonantesPorPalabras(String mensaje){
        StringBuilder mensajeEntregado = new StringBuilder();
        String[] array;
        array = mensaje.split("\\s|\n|,");


        for (int i = 0; i < mensaje.split("\\s|\n|,").length; i++) {
            mensajeEntregado.append("La palabra ").append(i+1).append(" tiene ").append(libStrings.cantidadVocalesYConsonantes(array[i])).append(".\n");

        }


        return mensajeEntregado;
    }


    /**
     *
     * @param mensaje Ingrese el mensaje que desee en formato {@link StringBuilder StringBuilder}
     * @return devuelve un string con un mensaje que indica la palabra mas grande y cuantas letras tiene
     */
    public static String palabraMasGRande(StringBuilder mensaje){
        String mensajeEntregado;
        String mensajeStr = mensaje.toString();
        String[] array = mensajeStr.split("\\s|\n|,");
        String palabra="";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length()> palabra.length()){
                palabra = array[i];
            }

        }
        mensajeEntregado = "La palabra "+ palabra+ " tiene "+ palabra.length()+ " letras.";

        return mensajeEntregado;
    }


    /**
     *
     * @param mensaje Ingrese el mensaje que desee en formato {@link String String}
     * @return devuelve un string con un mensaje que indica la palabra mas grande y cuantas letras tiene
     */
    public static String palabraMasGRande(String mensaje){
        String mensajeEntregado;
        String[] array = mensaje.split("\\s|\n|,");
        String palabra="";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length()> palabra.length()){
                palabra = array[i];
            }

        }
        mensajeEntregado = "La palabra "+ palabra+ " tiene "+ palabra.length()+ " letras.";

        return mensajeEntregado;
    }
}