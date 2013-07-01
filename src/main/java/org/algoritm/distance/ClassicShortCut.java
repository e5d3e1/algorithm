package org.algoritm.distance;

import java.math.BigDecimal;
import java.util.List;

/**
 * User: vostapets
 * Date: 6/28/13
 * Time: 9:01 PM
 */
public class ClassicShortCut implements ShortCut {

    @Override
    public ShortCutResult distance(List<Point> points) {
        Point[] array = points.toArray(new Point[]{});
        return distance(array);
    }

    @Override
    public ShortCutResult distance(Point[] points) {
        ShortCutResult result = ShortCutResult.valueOf(null, null, null);
        for (int i = 0; i < points.length; i++) {
            Point a = points[i];
            for (int j = i + 1; j < points.length; j++) {
                Point b = points[j];
                ShortCutResult distance = calcDistance(a, b);
                if (result.getDist() == null || result.getDist().compareTo(distance.getDist()) > 0) {
                    result = distance;
                }
            }
        }
        return result;
    }

    private ShortCutResult calcDistance(Point a, Point b) {
        double dist = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        return ShortCutResult.valueOf(a, b, new BigDecimal(dist));
    }
}
