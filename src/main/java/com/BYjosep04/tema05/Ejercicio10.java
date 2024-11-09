package com.BYjosep04.tema05;
import com.BYjosep04.tema05.lib.libStrings;

public class Ejercicio10 {
    public static void main(String[] args) {
        String frase =libStrings.ingresarFrase();
        System.out.println(palabraPalindromaEnFrase(frase));
    }
    public static String palabraPalindromaEnFrase(String frase){
        String[] array= frase.split("\\s+|\n|,");
        String palabra;
        int distancia = 1;
        int z;
        String palindroma= "";

        for (int i = 0; i < array.length; i++) {
            palabra= array[i];
            z=palabra.length();
            for (int j = 0; j < palabra.length(); j++) {

                if (palabra.charAt(z) == palabra.charAt(j)){
                    distancia=0;
                    z=-1;
                }else {
                    distancia=1;
                }

            }

            if (distancia == 0 ){
                palindroma = "La frase tiene la ";
                break;

            }else {
                palindroma = "No hay ninguna palabra palíndroma";
            }
        }


        return palindroma;
    }
}
