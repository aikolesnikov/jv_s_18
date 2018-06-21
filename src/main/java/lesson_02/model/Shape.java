package lesson_02.model;

abstract class Shape {
    String getShapeColor() {
        return shapeColor;
    }

    void setShapeColor( String shapeColor ) {
        this.shapeColor = shapeColor;
    }

    private String shapeColor;

    Shape() {
    }

    Shape(String color) {
        shapeColor = color;
    }

    abstract double calcArea();

    @Override
    public abstract String toString();
}

