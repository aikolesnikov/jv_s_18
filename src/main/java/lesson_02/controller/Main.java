package lesson_02.controller;

import lesson_02.model.Circle;
import lesson_02.model.Rectangle;
import lesson_02.model.Triangle;

public class Main {

    public static void main( String[] args ) {

        Rectangle r1 = new Rectangle( 20, 10, "red" );
        System.out.println( r1);

        Circle c1 = new Circle( "grey", 5 );
        System.out.println(c1);

        Triangle t1 = new Triangle("blue", 10, 12, 15);
        System.out.println(t1);
    }
}
