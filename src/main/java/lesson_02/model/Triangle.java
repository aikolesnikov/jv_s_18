package lesson_02.model;

public class Triangle extends Shape {

    private double radius;

    public Triangle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Triangle( double radius ) {
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
        return "Triangle of " + getShapeColor() + " color with size " + calcArea();
    }

}
