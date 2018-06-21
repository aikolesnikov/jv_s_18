package lesson_02.model;

public class Rectangle extends Shape {

    private double lenght;
    private double height;

    double getLenght() {
        return lenght;
    }

    void setLenght( double lenght ) {
        this.lenght = lenght;
    }

    double getHeight() {
        return height;
    }

    void setHeight( double height ) {
        this.height = height;
    }

    public Rectangle( double length, double height, String color ) {
        super( color );
        this.lenght = length;
        this.height = height;
    }

    void draw() {
        System.out.println( "Rectangle drawing." );
    }

    double calcArea() {
        return lenght * height;
    }

    public String toString() {
        return "Rectangle of " + getShapeColor() + " color with size " + calcArea();
    }
}
