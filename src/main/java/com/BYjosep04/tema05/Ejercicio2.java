package com.BYjosep04.tema05;

// Escribe un programa que muestre el numero
// de vocales y el numero de consonantes de una frase.

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
    String frase;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = scanner.nextLine();
        scanner.close();
    }


    public static int contador(String frase){
        int longitud, resultado;
        longitud= frase.length();


        //char valorPosicion = String.valueOf(frase.charAt(i));
        for (int i = 0; i < longitud-1; i++) {
            switch (Character.valueOf(String.valueOf(frase.charAt(i)))){
                case 'a'-> System.out.println("hola");
            }

        }

    return resultado;
    }
}
