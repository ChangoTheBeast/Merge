package com.spartaglobal.reece;

import java.util.Arrays;

public final class Printer {
    public static  <T extends Comparable<T>> void  print(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }
}
