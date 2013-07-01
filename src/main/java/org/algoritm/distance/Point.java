package org.algoritm.distance;

/**
 * User: vostapets
 * Date: 6/28/13
 * Time: 9:02 PM
 */
public class Point {
    private final Integer x;
    private final Integer y;

    private Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    static Point valueOf(Integer x, Integer y) {
        return new Point(x, y);
    }

    public Integer getX() {
        return x;
    }

    Integer getY() {
        return y;
    }
}
