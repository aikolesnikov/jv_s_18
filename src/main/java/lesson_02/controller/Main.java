package lesson_02.controller;

import lesson_02.model.Circle;
import lesson_02.model.Rectangle;
import lesson_02.model.Shape;
import lesson_02.model.Triangle;
import lesson_02.utils.Utils;
import lesson_02.view.Publisher;

public class Main {

    public static void main( String[] args ) {

        Rectangle r1 = new Rectangle( 20, 10, "red" );
        Circle c1 = new Circle( "grey", 5 );
        Triangle t1 = new Triangle("blue", 10, 12, 15);

        Shape[] sAr = new Shape[10];
        sAr[0] = r1;
        sAr[1] = c1;
        sAr[2] = t1;

        Publisher.printAllShapes( sAr);
        System.out.println( Utils.getSummarySize( sAr ));

    }
}
