package lesson_02.model;

public abstract class Shape {

    private String shapeColor;

    String getShapeColor() {
        return shapeColor;
    }

    void setShapeColor( String shapeColor ) {
        this.shapeColor = shapeColor;
    }

    Shape() {
    }

    Shape(String color) {
        shapeColor = color;
    }

    public abstract double calcArea();

    @Override
    public abstract String toString();
}

