package org.algoritm.multiply;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/3/13
 * Time: 10:14 AM
 */
public class ElementarMultiplyTest {

    @Test
    public void testOddMult() {
        ElementarMultiply multiply = new ElementarMultiply();

        int i = multiply.multiply(new int[]{5, 4, 3, 2, 1}, new int[]{9, 8, 7, 6, 5});

        assertEquals(56789 * 12345, i);
        assertEquals(25, multiply.getComplexity());
    }

    @Test
    public void testEvenMult() {
        ElementarMultiply multiply = new ElementarMultiply();

        int i = multiply.multiply(new int[]{4, 3, 2, 1}, new int[]{8, 7, 6, 5});

        assertEquals(5678 * 1234, i);
        assertEquals(16, multiply.getComplexity());
    }
}
