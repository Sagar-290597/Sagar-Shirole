package assign.task.apaar;

import java.util.Scanner;

public class MenuDrivenArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("MENU:");
        try {
            System.out.println("1.Area of circle");
            System.out.println("2.Area of triangle");
            System.out.println("3.Area of rectangle");
            System.out.println("Please enter any of the above option: ");
            num = Integer.parseInt(sc.next());

            if (num < 0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");

            System.out.println("Please enter any of the above option: ");
            num = Integer.parseInt(sc.next());

        }
        switch(num) {
            case 1:
                System.out.println("Please enter radius of circle: ");
                System.out.println("Enter Radius");
                double radius = sc.nextFloat();
                double areaCircle = (22 * radius * radius) / 7;
                System.out.println("Area of circle is: " + areaCircle);
                break;
            case 2:
                System.out.println("Please enter base and height of triangle: ");
                System.out.println("Enter base");
                double base = sc.nextFloat();

                System.out.println("Enter height");
                double height = sc.nextFloat();
                double areaTriangle = (base * height) / 2;
                System.out.println("Area of triangle is: " + areaTriangle);
                break;
            case 3:
                System.out.println("Please enter length and breadth of rectangle: ");
                System.out.println("Enter length");
                int length = sc.nextInt();

                System.out.println("Enter breadth");
                int breadth = sc.nextInt();
                int areaRectangle = length * breadth;
                System.out.println("Area of rectangle is: " + areaRectangle);
                break;

            default:
                System.out.println("Invalid Input:");
        }
    }
}
