package com.BYjosep04.tema05.Str;

public class Ejercicio14 {
    public static void main(String[] args) {
        contador1A9_9_9_9();
    }

    /**
     * Genera los numeros del 0-0-0-0 hasta el 9-9-9-9 y los imprime
     * modificando el numero 3 por la letra C
     */
    public static void contador1A9_9_9_9() {
        String valor1, valor2, valor3, valor4;
        for (int i = 0; i <= 9; i++) {
            valor4 = String.valueOf(i);
            valor4 = valor4.equals("3") ? "C" : valor4;
            for (int j = 0; j <= 9; j++) {
                valor3 = String.valueOf(j);
                valor3 = valor3.equals("3") ? "C" : valor3;
                for (int k = 0; k <= 9; k++) {
                    valor2 = String.valueOf(k);
                    valor2 = valor2.equals("3") ? "C" : valor2;
                    for (int l = 0; l <= 9; l++) {
                        valor1 = String.valueOf(l);
                        valor1 = valor1.equals("3") ? "C" : valor1;


                        System.out.println(valor4 + "-" + valor3 + "-" + valor2 + "-" + valor1);
                    }
                }
            }
        }
    }
}
