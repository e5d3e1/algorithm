package org.algoritm.distance;

import org.junit.Test;

import java.math.BigDecimal;

import static org.algoritm.distance.Point.valueOf;
import static org.junit.Assert.assertEquals;

/**
 * User: vostapets
 * Date: 6/29/13
 * Time: 8:53 AM
 */
public class ClassicShortCutTest {

    @Test
    public void simpleTest() {
        ShortCut shortCut = new ClassicShortCut();
        Point[] points = {
                valueOf(1, 5),
                valueOf(-2, 2),
                valueOf(1, -2),
                valueOf(-1, -3),
                valueOf(5, -1),
                valueOf(-5, 1),
        };
        ShortCutResult distance = shortCut.distance(points);
        assertEquals(BigDecimal.valueOf(5), distance.getDist());
    }
}
