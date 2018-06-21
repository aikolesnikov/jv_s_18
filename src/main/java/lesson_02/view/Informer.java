package lesson_02.view;

import lesson_02.model.Shape;

import java.util.Arrays;

public class Informer {

    public static void printShapes( Shape[] ar ) {
        System.out.println( Arrays.toString( ar ) );
    }

    public static double getSummarySize( Shape[] ar ) {
        double s = 0;
        for ( Shape shape : ar ) {
            if ( shape != null ) {
                s += shape.calcArea();
            }
        }

        return s;
    }
}
