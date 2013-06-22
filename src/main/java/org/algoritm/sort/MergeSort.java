package org.algoritm.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/2/13
 * Time: 5:17 PM
 */
public class MergeSort implements ISort {
    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sort() {
        int[] array = this.array;
        int length = array.length;

        int[] sort1 = halfSort(Arrays.copyOfRange(array, 0, length / 2));
        int[] sort2 = halfSort(Arrays.copyOfRange(array, length / 2, length));

        merge(array, sort1, sort2);

        return array;
    }

    private void merge(int[] array, int[] sort1, int[] sort2) {
        MergeUtil.merge(array, sort1, sort2);
    }

    private int[] halfSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
