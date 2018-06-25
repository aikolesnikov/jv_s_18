package lesson_02.utils;

import lesson_02.model.*;

import java.util.Comparator;

public class Utils {

    public static double getSummarySize( Shape[] ar ) {
        double s = 0;
        for ( Shape shape : ar ) {
            if ( shape != null ) {
                s += shape.calcArea();
            }
        }

        return s;
    }

    public static class ShapeSizeComparator implements Comparator<Shape> {

        @Override
        public int compare( Shape s1, Shape s2 ) {
            if ( s1 == null || s2 == null ) {
                return 0;
            }
            if ( s1.calcArea() == s2.calcArea() ) {
                return 0;
            } else if ( s1.calcArea() == s2.calcArea() ) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static class ShapeColorComparator implements Comparator<Shape> {

        @Override
        public int compare( Shape s1, Shape s2 ) {
            if ( s1 == null || s2 == null ) {
                return 0;
            }
            return s1.getShapeColor().compareTo( s2.getShapeColor() );
        }
    }
}
