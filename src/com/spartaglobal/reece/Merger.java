package com.spartaglobal.reece;

import java.util.*;

public class Merger {
    public static <T extends Comparable<T>> T[] merge(T[] array1, T[] array2) {
        if (array1.length > 0 && array2.length > 0) {
            if (array1[0].getClass() != array2[0].getClass()) {
                System.err.println("Please supply arrays of the same type.");
                return null;
            } else {
                T[] outputArray = Arrays.copyOf(array1,(array1.length + array2.length));
                Printer.print(outputArray);
                for (int i = 0; i < array2.length; i++) {
                    outputArray[array1.length + i] = array2[i];
                }
                Arrays.sort(outputArray);
                return outputArray;
            }
        } else if (array1.length == 0 && array2.length == 0){
            System.err.println("Cannot merge two empty arrays.");
            return null;
        } else {
            return (array1.length == 0) ? array2 : array1;
        }
    }

    public static int[] merge(int[] array1, int[] array2) {
        if (array1.length > 0 && array2.length > 0) {
            int[] outputArray = Arrays.copyOf(array1,array1.length + array2.length);
            for (int i = 0; i < array2.length; i++) {
                outputArray[array1.length + i] = array2[i];
            }
            Arrays.sort(outputArray);
            return outputArray;
        } else if (array1.length == 0 && array2.length == 0){
            System.err.println("Cannot merge two empty arrays.");
            return null;
        } else {
            return (array1.length == 0) ? array2 : array1;
        }
    }

    public static int[] mergeNoDuplicates(int[] array1, int[] array2) {
        Set set = new HashSet();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int number : array1) {
            if (!set.contains(number)) {
                list.add(number);
                set.add(number);
            }
        }
        for (int number : array2) {
            if (!set.contains(number)) {
                list.add(number);
                set.add(number);
            }
        }
        Collections.sort(list);
        int[] outputArray = new int[list.size()];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = list.get(i);
        }
        return outputArray;
    }
}
