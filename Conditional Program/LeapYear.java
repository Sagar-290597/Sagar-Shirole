package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year;
        try{
            System.out.print("Enter a number: ");
            year = Integer.parseInt(sc.next());
            if (year < 0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch (InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Number");
            System.out.println("Enter valid Number");

            System.out.println("Enter The Number");
            year = Integer.parseInt(sc.next());
        }
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else if (year<0)
        {
            System.out.println(year + " is not a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
