package org.algoritm.util;

import java.util.Arrays;

/**
 * User: vostapets
 * Date: 6/29/13
 * Time: 1:57 PM
 */
public class ArrayUtil {
    private ArrayUtil() {
    }

    public static <T> HalfArray<T> halfArray(T[] array) {
        int length = array.length;

        T[] half1 = Arrays.copyOfRange(array, 0, length / 2);
        T[] half2 = Arrays.copyOfRange(array, length / 2, length);

        return new HalfArray<T>(half1, half2);
    }

    public static class HalfArray<T> {
        private final T[] half1;
        private final T[] half2;

        private HalfArray(T[] half1, T[] half2) {
            this.half1 = half1;
            this.half2 = half2;
        }

        public T[] getHalf1() {
            return half1;
        }

        public T[] getHalf2() {
            return half2;
        }
    }
}
