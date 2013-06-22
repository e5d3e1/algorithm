package org.algoritm.sort;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/2/13
 * Time: 5:36 PM
 */
public class MergeSortTest {

    @Test
    public void test1() {
        ISort mergeSort = new MergeSort(new int[]{5, 4, 1, 8, 7, 2, 6, 3});
        int[] sort = mergeSort.sort();
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, sort));
    }

    @Test
    public void test2() {
        ISort mergeSort = new MergeSort(new int[]{5, 4, 1, 8, 7, 2, 6, 3, 9});
        int[] sort = mergeSort.sort();
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, sort));
    }
}
