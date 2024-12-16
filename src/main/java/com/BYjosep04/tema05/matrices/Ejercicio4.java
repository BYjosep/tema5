package com.BYjosep04.tema05.matrices;

import com.BYjosep04.tema05.lib.LibStrings;
import com.BYjosep04.tema05.matrices.ejercicio4Metodos.DevuelveUnaMatriz;
import com.BYjosep04.tema05.matrices.ejercicio4Metodos.VerValoresEspecificos;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int FILAS = 4, COLUMNAS = 8;
        int[][] matriz, matrizTranspuesta;

        matriz = DevuelveUnaMatriz.rellenarMatrizDeAleatiriosInt(FILAS, COLUMNAS);
        System.out.println(matrizToString(matriz));

        matrizTranspuesta = DevuelveUnaMatriz.crearMatrizTranspuesta(matriz);
        System.out.println(matrizToString(matrizTranspuesta));

        System.out.println(matrizConSuma(matriz));
        System.out.println(
                "El numero maximo de la matriz es:" + VerValoresEspecificos.maximoDeUnaMatriz(matriz)
                        + "\nEl numero minimo de la  matriz es: " + VerValoresEspecificos.miniomoDeUnaMatriz(matriz)
        );
        System.out.println("La media es: " + VerValoresEspecificos.mediaDeUnaMatriz(matriz));
        System.out.println(VerValoresEspecificos.verUnaPosicion(matriz));

        System.out.println(verUnaFila(matriz));
        System.out.println(verUnaColumna(matriz));
        System.out.println("\n------------------------\n");
        sumaEnLaUltimaComnaDeLaMatriz(matriz);
        System.out.println(matrizToString(matriz));


    }


    public static String matrizToString(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int[] array : matriz) {
            for (int valor : array) {
                sb.append(valor).append("  ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static String matrizConSuma(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            sb.append("Fila ").append(i).append(" ");
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sb.append(matriz[i][j]).append(" ");
                suma += matriz[i][j];
            }
            sb.append("     Tiene como Suma: ").append(suma).append("\n");
        }
        return sb.toString();
    }


    public static String verUnaColumna(int[][] matriz) {
        int num;
        StringBuilder fila = new StringBuilder();
        num = LibStrings.ingresarUnaOpcion("Ingrese que fila desea ver 0-" + (matriz.length - 1)
                , 0, (matriz.length - 1));
        for (int i = 0; i < matriz.length; i++) {
            fila.append(matriz[i][num]).append(", ");
        }
        fila.delete(fila.length() - 2, fila.length());

        return fila.toString();
    }


    public static String verUnaFila(int[][] matriz) {
        int num;
        StringBuilder columna = new StringBuilder();
        num = LibStrings.ingresarUnaOpcion("Ingrese que columna desea ver 0-" + (matriz[0].length - 1)
                , 0, (matriz[0].length - 1));

        for (int i = 0; i < matriz[num].length; i++) {
            columna.append(matriz[num][i]).append(", ");
        }
        columna.delete(columna.length() - 2, columna.length());

        return columna.toString();
    }

    public static void sumaEnLaUltimaComnaDeLaMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < (matriz[i].length - 1); j++) {
                suma += matriz[i][j];
            }
            matriz[i][(matriz[i].length - 1)] = suma;
        }


    }
}
