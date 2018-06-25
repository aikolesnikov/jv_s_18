package lesson_02.model;

import java.util.Comparator;

public abstract class Shape{

    private String shapeColor;

    public String getShapeColor() {
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

