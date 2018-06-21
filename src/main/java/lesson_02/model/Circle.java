package lesson_02.model;

public class Circle extends Shape {

    private double radius;

    public Circle( String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle( double radius ) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius ) {
        this.radius = radius;
    }

    double calcArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle of " + getShapeColor() + " color with size " + calcArea();
    }

}
