package lesson_02;

public class Rectangle extends Shape{
    public void draw() {
        System.out.println("Rectangle draw");
    }

    double calcArea(double... a) {
        return a[0]*a[1];
    }

    public String toString() {
        return null;
    }
}
