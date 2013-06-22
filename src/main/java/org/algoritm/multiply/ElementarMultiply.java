package org.algoritm.multiply;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/2/13
 * Time: 9:19 AM
 */
public class ElementarMultiply {
    public static final int TEN = 10;
    public static final int NINE = 9;
    private int complexity;

    public ElementarMultiply() {
        complexity = 0;
    }

    public int multiply(int[] x, int[] y) {
        List<int[]> list = new ArrayList<>();
        for (int aX : x) {
            int[] result = new int[TEN];
            for (int yi = 0; yi < y.length; yi++) {
                int yValue = y[yi];
                int mult = numberMultiple(aX, yValue);
                if (mult <= NINE) {
                    plus(result, yi, mult);
                } else if (mult > NINE) {
                    plus(result, yi, mult % TEN);
                    plus(result, yi + 1, mult / TEN);
                }
            }
            list.add(result);
        }

        int i = 0;
        int m = 0;
        for (int[] ints : list) {
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                int i1 = anInt * (int)Math.pow(TEN, i) * (int)Math.pow(TEN, j);
                m += i1;
            }
            i++;
        }

        return m;
    }

    public void plus(int[] result, int i, int mult) {
        int locRes = result[i] + mult;
        if (locRes <= NINE) {
            result[i] += mult;
        } else if (locRes > NINE) {
            result[i] += mult % TEN;
            if (result[i] > NINE) {
                result[i + 1] = result[i] / TEN;
                result[i] = result[i] % TEN;
            }
            result[i + 1] += mult / TEN;
        }
    }

    private int numberMultiple(int x, int y) {
        complexity++;
        return x * y;
    }

    public int getComplexity() {
        return complexity;
    }
}
