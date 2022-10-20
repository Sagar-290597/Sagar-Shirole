package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AsteriskPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=0;
        try {
            System.out.println("Input number of terms :");
            num = Integer.parseInt(sc.next());
            if(num<0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Input number of terms :");
            num = Integer.parseInt(sc.next());
        }
        for (int i = 1; i <= num; i++)
        {
            for (int j = i; j <= num; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
