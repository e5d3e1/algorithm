package org.algoritm.main;

import org.algoritm.multiply.ElementarMultiply;
import org.algoritm.sort.MergeSort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/2/13
 * Time: 9:18 AM
 */
public class Main {

    public static final int[] TEST_SORT = new int[]{5, 4, 1, 8, 7, 2, 6, 3};
    public static final int[] X = new int[]{5, 4, 3, 2, 1};
    public static final int[] Y = new int[]{9, 8, 7, 6, 5};

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test2() {
        MergeSort mergeSort = new MergeSort(TEST_SORT);
        int[] sort = mergeSort.sort();
        System.out.println(Arrays.toString(sort));
    }

    private static void test1() {
        ElementarMultiply multiply = new ElementarMultiply();

        int i = multiply.multiply(X, Y);

        System.out.println("i = " + i);
        System.out.println("complex = " + multiply.getComplexity());
        System.out.println("i = " + 56789 * 12345);
    }
}
