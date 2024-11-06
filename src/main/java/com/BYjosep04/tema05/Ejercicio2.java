package com.BYjosep04.tema05;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String frase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = scanner.nextLine();
        scanner.close();
        System.out.println(resultado(frase));
    }


    public static String resultado(String frase) {
        int longitud;
        String resultado;
        int vocales, consonantes;
        vocales = 0;
        consonantes = 0;
        frase = frase.toLowerCase();
        longitud = frase.length();

        //char[] test = frase.toCharArray();
        for (int i = 0; i < longitud; i++) {

            switch (frase.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> vocales += 1;
                case 'q', 'w', 'r', 't', 'y', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                     'z', 'x', 'c', 'v', 'b', 'n', 'm' -> consonantes += 1;
            }

        }
        resultado = "El resultado ha sido de "+ vocales+" vocales y "+consonantes+" consonates";
        return resultado;
    }
}