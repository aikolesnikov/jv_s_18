package lesson_02.model;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle( String color, double a, double b, double c ) {
        super( color );
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA( double a ) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB( double b ) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC( double c ) {
        this.c = c;
    }

    public double calcArea() {
        double p = ( a + b + c ) / 2;

        return Math.sqrt(p * ( p - a ) * ( p - b ) * ( p - c ));
    }

    public String toString() {
        return "Triangle of " + getShapeColor() + " color with size " + calcArea();
    }
}
