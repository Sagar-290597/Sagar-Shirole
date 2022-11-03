package oops.Area;

public class Rectangle {
    double length, breadth;
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("The Area Of Rectangle Is: " + (length * breadth));
    }
}