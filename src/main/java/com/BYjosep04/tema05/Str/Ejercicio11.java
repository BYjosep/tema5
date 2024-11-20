package com.BYjosep04.tema05.Str;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio11 {
    public static void main(String[] args) {
        String nombre, primerApellido, segundoApellido;
        nombre = LibStrings.ingresarTexto("Ingrese El nombre");
        primerApellido = LibStrings.ingresarTexto("Ingrese el primer apellido");
        segundoApellido = LibStrings.ingresarTexto("Ingrese el segundo apellido");
        LibStrings.cerrarScaner();
        concentrador(nombre, primerApellido, segundoApellido);

    }

    /**
     * @param nombre Nombre ingresado
     * @param primerApellido Primer apellido ingresado
     * @param segundoApellido Segundo apellido ingresado
     */
    public static void concentrador (String nombre, String primerApellido, String segundoApellido){
        String nombreStr= nombre + " " + primerApellido + " " + segundoApellido;

        System.out.println(nombreCompletoEnMayusculasMinusculasYLongitud(nombreStr));
        primerosCincoCaracteres(nombreStr);

        System.out.println("Hay "+ocurrenciasDeUltimoCaracter(nombreStr)+" ocurrencias en el nombre completo");
        System.out.println(ocurrenciaPrimeraLetraEnMayuscula(nombreStr));
        System.out.println(cadenaConSimbolosDelanteDetras(nombreStr));
        System.out.println(cadenaInvertida(nombreStr));
    }

    /**
     * @param nombreComppleto Nombre con apellidos en formato {@link String String}
     * @return Devuelve un String con toda la informacion necesaria
     */
    public static String nombreCompletoEnMayusculasMinusculasYLongitud(String nombreComppleto){
        String nombreMayusculas, nombreMinusculas;
        int longitud;
        nombreMayusculas = nombreComppleto.toUpperCase();
        nombreMinusculas = nombreComppleto.toLowerCase();
        longitud = nombreComppleto.length();
        return "El nombre completo en mayusculas "+ nombreMayusculas+
                ".\nEl nombre en minusculas " +nombreMinusculas+
                "\nLa longitud del nombre completo "+longitud;
    }


    /**
     * @param nombreComppleto El nombre completo en formato {@link String String}
     */
    public static void primerosCincoCaracteres(String nombreComppleto){
        StringBuilder letras = new StringBuilder();
        if (nombreComppleto.length()> 5){
            for (int i = 0; i < 5; i++) {
                letras.append(nombreComppleto.charAt(i));
            }
            System.out.println(letras);
        }else {
            System.err.println("Error, el nombre no cumple el tamaño minimo de 5 caracteres");
        }
    }


    /**
     * cuenta las ocurrencias de la ultima letra del texto
     * @param texto Ingrese el texto en formato {@link  String String}
     * @return Devuelve un numero de tipo {@link Integer int}
     */
    public static int ocurrenciasDeUltimoCaracter(String texto){
        char ultimaLetra;
        ultimaLetra= texto.charAt(texto.length()-1);
        int ocurrencias=0;
        for (int i = 0; i < texto.length(); i++) {
            if (ultimaLetra == texto.charAt(i)){
                ocurrencias++;
            }
        }
        return ocurrencias;

    }


    /**
     * Ingresa el texto y devuelve la frase pero la primera letra y
     * las que coincidan en maysculas
     * @param texto Ingrese el texto en formaro {@link String String}
     * @return Devuelve todas las letras que coincidan con la primera
     * por la letra en mayusculas
     */
    public static String ocurrenciaPrimeraLetraEnMayuscula(String texto){
        char primeraLetra = texto.charAt(0);
        String str = Character.toString(primeraLetra);
        String mensaje;

        mensaje = texto.replaceAll(str, String.valueOf(Character.toUpperCase(primeraLetra)));

        return mensaje;
    }

    /**
     * @param texto Texto en formato {@link String String}
     * @return devuelve *** texto ***
     */
    public static String cadenaConSimbolosDelanteDetras(String texto){
        return "***" + " " + texto + " " + "***";
    }


    /**
     * @param texto Ingrese el texto en formato {@link String String}
     * @return Devuelve la cadena en formato {@link String String} a la inversa
     */
    public static String cadenaInvertida(String texto){
        StringBuilder sb = new StringBuilder();
        sb.append(texto);
        return sb.reverse().toString();
    }
}
