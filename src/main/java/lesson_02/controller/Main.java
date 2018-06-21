package lesson_02.controller;

import lesson_02.model.Rectangle;
import lesson_02.model.Triangle;

public class Main {

    public static void main( String[] args ) {

        Rectangle r1 = new Rectangle( 20, 10, "red" );
        System.out.println( r1);

        Triangle t1 = new Triangle( "grey", 5 );
        System.out.println(t1);

    }
}
