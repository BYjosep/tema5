package com.BYjosep04.tema05;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String frase, fraseModificada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = scanner.nextLine();
        scanner.close();
        fraseModificada= primeraLetraMayuscula(frase);
        System.out.println(fraseModificada);
    }

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
}
