package com.BYjosep04.tema05;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
         String frase;
         int veces;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese una frase");
         frase = scanner.nextLine();
        System.out.println("Ingrese cuantas veces quieres que se repita");
        veces= Integer.parseInt(scanner.nextLine());
        System.out.println(repetirFrase(frase, veces));
    }

    /**
     *
     * @param frase Ingresa una frase en formato {@link String String}
     * @param veces Ingresa el numero de veces en formato {@link Integer int}
     * @return Devuelve un texto en formato {@link StringBuilder StringBuilder}
     */
    public static  StringBuilder repetirFrase(String frase, int veces){
        StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < veces; i++) {
            mensaje.append(frase).append("\n");
        }
        return mensaje;
    }
}