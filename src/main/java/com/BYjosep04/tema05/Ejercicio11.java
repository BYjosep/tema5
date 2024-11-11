package com.BYjosep04.tema05;

import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio11 {
    public static void main(String[] args) {
        String nombre, primerApellido, segundoApellido;
        nombre = libStrings.ingresarTexto("Ingrese El nombre");
        primerApellido = libStrings.ingresarTexto("Ingrese el primer apellido");
        segundoApellido = libStrings.ingresarTexto("Ingrese el segundo apellido");
        libStrings.cerrarScaner();
        concentrador(nombre, primerApellido, segundoApellido);

    }
    public static void concentrador (String nombre, String primerApellido, String segundoApellido){
        StringBuilder nombreCompleto = new StringBuilder();
        nombreCompleto.append(nombre).append(" ").append(primerApellido).append(" ").append(segundoApellido);
        String nombreStr= nombreCompleto.toString();

        System.out.println(nombreCompletoEnMayusculasMinusculasYLongitud(nombreStr));
        System.out.println(primerosCincoCaracteres(nombreStr));

    }

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
    public static void primerosCincoCaracteres(String nombreComppleto){
        if (nombreComppleto.length()< 5){
            System.out.println("hhh");
        }else {
            System.err.println("error");
        }
    }
}
