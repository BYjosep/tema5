package com.BYjosep04.tema05.Arr;

import com.BYjosep04.tema05.lib.LibStrings;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] array= new int[10];
        LibStrings.generadorAleatorio(array, 0,50);
        int opcion= LibStrings.ingresarUnNumero("""
                MENÚ PRINCIPAL
                ==============
                1.-Rellenar array.
                2.-Visualizar contenido del array
                3.-Visualizar contenido par.
                4.-Visualizar contenido múltiplo de 3
                0.-Salir del menú.
                Selecciona una opción:""",0,4);

        switch (opcion){
            case 1->{}
            case 2->{}
            case 3->{}
            case 4->{}
            case 0->{}

        }
    }

    public static void crearArray (int[] array) {
        LibStrings.generadorAleatorio(array, 0,50);
    }

    public static void visualizarArray (int[] array) {
        String arrayStr= array.toString();
        System.out.println(arrayStr);
    }
    public static void visualizarPares(int[] array) {
        StringBuilder sb= new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if(i %2==0)
                sb.append(array[i]).append(",");
        }
        sb.delete(sb.length()-1,sb.length()-1);
        sb.append("]");

    }
}
