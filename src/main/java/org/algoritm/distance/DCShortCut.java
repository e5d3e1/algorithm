package org.algoritm.distance;

import org.algoritm.util.ArrayUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * User: vostapets
 * Date: 6/29/13
 * Time: 9:03 AM
 */
public class DCShortCut implements ShortCut {

    private Comparator<Point> comparatorByX
            = new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            int compare = o1.getX().compareTo(o2.getX());
            if (compare != 0) {
                return compare;
            } else {
                return o1.getY().compareTo(o2.getY());
            }
        }
    };

    @Override
    public ShortCutResult distance(List<Point> points) {
        Collections.sort(points, comparatorByX);

        searchMinDistX(points);

        ArrayUtil.HalfArray<Point> halfArray = ArrayUtil.halfArray(points.toArray(new Point[]{}));



        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ShortCutResult distance(Point[] points) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private void searchMinDistX(List<Point> points) {
//        if (points)
    }
}
