package OOPS;

import java.util.Scanner;

class Rectangle {
    double length, breadth;
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("The Area Of Rectangle Is: " +(length * breadth));
    }
}
public class CalculateArea {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int l , b;
        try
        {
            System.out.println("Enter The Length: ");
            l = Integer.parseInt(sc.next());
            if(l < 0){
                System.out.println("Invalid Input...Enter Valid Input!");
                System.out.println("Enter The Length: ");
                l = Integer.parseInt(sc.next());
            }
            System.out.println("Enter The Breadth: ");
            b = Integer.parseInt(sc.next());
            if(b < 0){
                System.out.println("Invalid Input...Enter Valid Input!");
                System.out.println("Enter The Breadth: ");
                b = Integer.parseInt(sc.next());
            }
        }catch(Exception e) {
            System.out.println("Invalid Input...Enter Valid Input!");
            System.out.println("Enter The Length: ");
            l = Integer.parseInt(sc.next());
            System.out.println("Enter The Breadth: ");
            b = Integer.parseInt(sc.next());
        }
        Rectangle rectangle = new Rectangle(l , b);
        rectangle.area();
    }
}