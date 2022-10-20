package assign.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloydTriangle
{
    public static void main(String[] args)
    {
        int a, b, x, y;
        int rows=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please enter number of rows to print pattern: ");
            rows = Integer.parseInt(sc.next());
            if(rows<0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Please enter number of rows to print pattern: ");
            rows = Integer.parseInt(sc.next());
        }
        for(a = 1; a <= rows; a++)
        {
            if(a % 2 == 0)
            {
                x = 1;
                y = 0;
            }
            else
            {
                x = 0;
                y = 1;
            }
            for(b = 1; b <= a; b++)
            {
                if(b % 2 == 0)
                {
                    System.out.print(x);
                }
                else
                {
                    System.out.print(y);
                }
            }
            System.out.println("");
            sc.close();
        }
    }
}

