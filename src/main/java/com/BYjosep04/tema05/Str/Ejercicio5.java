package com.BYjosep04.tema05.Str;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresre una frase:");
        sb.append(scanner.nextLine());
        scanner.close();
        System.out.println(palabraMasGRande(sb));

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
}
