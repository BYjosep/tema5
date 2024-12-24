package com.BYjosep04.tema05.Arr_busquedaYOrdenacion.ordenacion;

public class ArrayEstadisticas {
    private final int[] array;
    private int min;
    private int max;

    public ArrayEstadisticas(int[] array) {
        this.array = array;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }


}
