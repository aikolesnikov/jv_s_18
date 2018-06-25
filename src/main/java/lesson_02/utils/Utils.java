package lesson_02.utils;

import lesson_02.model.*;
import lesson_02.view.*;


import java.util.Arrays;
import java.util.Comparator;

import static lesson_02.view.Publisher.printAllShapes;

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

    public static void main( String[] args ) {


        Rectangle r1 = new Rectangle( 20, 10, "red" );
        Circle c1 = new Circle( "grey", 5 );
        Triangle t1 = new Triangle( "blue", 10, 12, 15 );

        Shape[] sAr = new Shape[10];
        sAr[0] = r1;
        sAr[1] = c1;
        sAr[2] = t1;

        printAllShapes( sAr );
        // Arrays.sort( sAr, new ShapeSizeComparator() );
        // printAllShapes( sAr );
        Arrays.sort( sAr, new ShapeColorComparator() );
        printAllShapes( sAr );


    }

    static class ShapeSizeComparator implements Comparator<Shape> {

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

    static class ShapeColorComparator implements Comparator<Shape> {

        @Override
        public int compare( Shape s1, Shape s2 ) {
            if ( s1 == null || s2 == null ) {
                return 0;
            }
            return s1.getShapeColor().compareTo( s2.getShapeColor() );
        }
    }
}
