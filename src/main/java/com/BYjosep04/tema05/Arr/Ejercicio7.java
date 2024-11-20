package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] array = new int[100];
        String multiplos5, multiplos10;
        LibStrings.generadorAleatorio(array, 0, 100);
        multiplos5 = multiplosDeN(array, 5);
        multiplos10 = multiplosDeN(array, 10);

        System.out.println(multiplos5);
        System.out.println(multiplos10);
        System.out.println(vecesDe0(array));
    }


    public static String vecesDe0(int[] numeros) {
        StringBuilder vecesDe0 = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                vecesDe0.append("La posicion ").append(i).append(" tiene como valor 0");
            }
        }
        return vecesDe0.toString();
    }


    /**
     * Metodo para saber los multiplos del número 5
     *
     * @param numero array de numero
     * @return Devuelve un String con los multiplos y su posicion
     */
    public static String multiplosDe5(int[] numero) {
        StringBuilder multiplos = new StringBuilder();
        multiplos.append("********************").append("\n");
        multiplos.append("** multiplos de 5 **").append("\n");
        multiplos.append("********************").append("\n");

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 5 == 0) {
                multiplos.append("La posicion ").append(i).append(" tiene: ").append(numero[i]).append("\n");
            }

        }
        return multiplos.toString();
    }

    /**
     * Metodo para saber los multiplos del número 10
     *
     * @param numero array de numero
     * @return Devuelve un String con los multiplos y su posicion
     */
    public static String multiplosDe10(int[] numero) {
        StringBuilder multiplos = new StringBuilder();
        multiplos.append("*********************").append("\n");
        multiplos.append("** multiplos de 10 **").append("\n");
        multiplos.append("*********************").append("\n");

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 10 == 0) {
                multiplos.append("La posicion ").append(i).append(" tiene: ").append(numero[i]).append("\n");
            }

        }
        return multiplos.toString();
    }


    /**
     * Metodo general para saber los multiplos de cualquier número
     *
     * @param numero array de numero
     * @param n      El número del cual desea saber los multiplos existentes
     * @return Devuelve un String con los multiplos y su posicion
     */
    public static String multiplosDeN(int[] numero, int n) {
        StringBuilder multiplos = new StringBuilder();
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % n == 0) {
                multiplos.append("La posicion ").append(i).append(" tiene: ").append(numero[i]).append("\n");
            }

        }
        return multiplos.toString();
    }
}
