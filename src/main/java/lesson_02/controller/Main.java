package lesson_02.controller;

import lesson_02.model.Circle;
import lesson_02.model.Rectangle;
import lesson_02.model.Shape;
import lesson_02.model.Triangle;
import lesson_02.view.Informer;

import javax.sound.sampled.Line;

public class Main {

    public static void main( String[] args ) {

        Rectangle r1 = new Rectangle( 20, 10, "red" );
        // System.out.println( r1);

        Circle c1 = new Circle( "grey", 5 );
        // System.out.println(c1);

        Triangle t1 = new Triangle("blue", 10, 12, 15);
        // System.out.println(t1);

        Shape[] sAr = new Shape[10];
        sAr[0] = r1;
        sAr[1] = c1;
        sAr[2] = t1;

        Informer.printShapes(sAr);
        System.out.println(Informer.getSummarySize( sAr ));

    }
}
