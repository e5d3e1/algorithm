package org.algoritm.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/5/13
 * Time: 6:14 PM
 */
public class MergeSort2 implements ISort {
    private int[] array;

    public MergeSort2(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sort() {
        return recSort(array);
    }

    private int[] recSort(int[] array) {
        if (array.length == 1) {
            return array;
        } else {
            int length = array.length;
            int[] left = Arrays.copyOfRange(array, 0, length / 2);
            int[] right = Arrays.copyOfRange(array, length / 2, length);
            left = recSort(left);
            right = recSort(right);
            int i = left.length + right.length;
            int[] result = new int[i];
            merge(result, left, right);
            return result;
        }
    }

    private void merge(int[] array, int[] left, int[] right) {
        MergeUtil.merge(array, left, right);
    }
}
