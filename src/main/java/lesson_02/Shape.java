package lesson_02;

abstract class Shape {
    private String shapeColor;

    Shape() {
    }

    Shape(String color) {
        shapeColor = color;
    }

    abstract double calcArea(double ... a);

    @Override
    public abstract String toString();
}


