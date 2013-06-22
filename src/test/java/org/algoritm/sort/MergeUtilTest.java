package org.algoritm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * User: vostapets
 * Date: 6/19/13
 * Time: 7:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeUtilTest {

    @Test
    public void mergeTest() {
        int[] array = new int[4];
        int[] left = {1, 3};
        int[] right = {2, 4};
        MergeUtil.merge(array, left, right);
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, array));
    }
}
