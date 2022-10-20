package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumToMonths
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int x;
        try
        {
            System.out.print("Enter Month Number:");
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

            System.out.print("Enter Month Number:");
            x = Integer.parseInt(sc.next());
        }

        switch (x) {
            case 1:
            {
                System.out.println("January ");
                break;
            }
            case 2:
            {
                System.out.println("February ");
            }
            case 3:
            {
                System.out.println("March");
                break;
            }
            case 4:
            {
                System.out.println("April");
                break;
            }
            case 5:
            {
                System.out.println("May ");
                break;
            }
            case 6:
            {
                System.out.println("June");
                break;
            }
            case 7:
            {
                System.out.println("July");
                break;
            }
            case 8:
            {
                System.out.println("August ");
                break;
            }
            case 9:
            {
                System.out.println("September");
                break;
            }
            case 10:
            {
                System.out.println("October");
                break;
            }
            case 11:
            {
                System.out.println("November");
                break;
            }
            case 12:
            {
                System.out.println("December");
                break;
            }

            default:
                System.out.println("Invalid Input..");
        }

    }
}
