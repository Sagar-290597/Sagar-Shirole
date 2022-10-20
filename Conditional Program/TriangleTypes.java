package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTypes
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        try {
            System.out.println("Enter length of first side of triangle:");
            a = Double.parseDouble(sc.next());
            if (a < 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("Enter length of second side of triangle:");
            b = Double.parseDouble(sc.next());
            if (b < 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("Enter length of third side of triangle:");
            c = Double.parseDouble(sc.next());
            if (c < 0) {
                throw new IllegalArgumentException();
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");

            System.out.println("Enter length of first side of triangle:");
            a = Double.parseDouble(sc.next());
            System.out.println("Enter length of second side of triangle:");
            b = Double.parseDouble(sc.next());
            System.out.println("Enter length of third side of triangle:");
            c = Double.parseDouble(sc.next());
        }


        if (b + c <= a || a + c <= b || a + b <= c) {
            System.out.println("The Triangle Valid ");
        } else {
            System.out.println("The Triangle Not Valid ");
        }
    }
}
