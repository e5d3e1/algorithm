package org.algoritm.sort;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;

/**
 * User: vostapets
 * Date: 6/19/13
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort2Test {
    @Test
    public void test1() {
        ISort mergeSort = new MergeSort2(new int[]{5, 4, 1, 8, 7, 2, 6, 3});
        int[] sort = mergeSort.sort();
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, sort));
    }

    @Test
    public void test2() {
        ISort mergeSort = new MergeSort2(new int[]{5, 4, 1, 8, 7, 2, 6, 3, 9});
        int[] sort = mergeSort.sort();
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, sort));
    }

}
