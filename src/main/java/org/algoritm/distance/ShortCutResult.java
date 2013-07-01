package org.algoritm.distance;

import java.math.BigDecimal;

/**
 * User: vostapets
 * Date: 6/28/13
 * Time: 9:11 PM
 */
class ShortCutResult {

    private final Point a;
    private final Point b;
    private final BigDecimal dist;

    private ShortCutResult(Point a, Point b, BigDecimal dist) {
        this.a = a;
        this.b = b;
        this.dist = dist;
    }

    public static ShortCutResult valueOf(Point a, Point b, BigDecimal dist) {
       return new ShortCutResult(a, b, dist);
    }

    Point getA() {
        return a;
    }

    Point getB() {
        return b;
    }

    BigDecimal getDist() {
        return dist;
    }
}
