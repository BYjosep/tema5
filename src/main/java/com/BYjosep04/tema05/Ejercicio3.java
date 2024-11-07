package com.BYjosep04.tema05;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresre una frase:");
        sb.append(scanner.nextLine());
        scanner.close();
        System.out.printf("La frase tiene %d palabras", contadorPalabras(sb));
    }

    /**
     * @param mensaje Variable como {@link StringBuilder StringBuilder}
     * @return Devuelve un entero como valor
     */
    public static int contadorPalabras(StringBuilder mensaje) {
        String mensajeStr = mensaje.toString();


        return mensajeStr.split("\\s|\n|,").length;
    }

}
