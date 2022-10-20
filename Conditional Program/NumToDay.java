package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumToDay
{
    public static void main(String []args)
{
    Scanner sc =new Scanner(System.in);
    int x;
    try
    {
        System.out.print("Enter Day Number:");
        x = Integer.parseInt(sc.next());
        if (x < 0)
        {
            throw new IllegalArgumentException();
        }
    }
    catch (InputMismatchException | IllegalArgumentException e)
    {
        System.out.println("Invalid Input..");
        System.out.println("Enter Valid Number");

        System.out.print("Enter Day Number:");
        x = Integer.parseInt(sc.next());
    }

    switch (x) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Enter Valid Input");
    }

}
}
