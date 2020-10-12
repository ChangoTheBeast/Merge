package com.spartaglobal.reece;


import java.util.Arrays;

public class Starter {
    public void start() {
        int[] intArray1 = ArrayGen.getInts(10, 20);
        int[] intArray2 = ArrayGen.getInts(12, 20);
        int[] mergedIntArray = Merger.merge(intArray1, intArray2);
        int[] mergedIntArrayNoDupes = Merger.mergeNoDuplicates(intArray1, intArray2);

        Printer.print(intArray1);
        Arrays.sort(intArray1);
        Printer.print(intArray2);
        Arrays.sort(intArray2);
        Printer.print(intArray1);
        Printer.print(intArray2);
        Printer.print(mergedIntArray);
        Printer.print(mergedIntArrayNoDupes);
    }
}
