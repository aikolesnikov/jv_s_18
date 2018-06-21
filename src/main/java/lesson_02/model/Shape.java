package lesson_02.model;

abstract class Shape {

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

    abstract double calcArea();

    @Override
    public abstract String toString();
}

