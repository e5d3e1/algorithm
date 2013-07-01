package org.algoritm.distance;

import java.util.List;

/**
 * User: vostapets
 * Date: 6/28/13
 * Time: 9:00 PM
 */
public interface ShortCut {

    ShortCutResult distance(List<Point> points);

    ShortCutResult distance(Point[] points);
}
