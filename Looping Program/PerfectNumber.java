package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumber
{
    static void printDivisors(int n) {
        int sum = 0;
        int i;
        for (i = 1; i <= n - 1; i++)
        {
            if (n % i == 0)
            {
                System.out.print(i + " ");
                int demo=i;
                sum+=demo;
            }
        }
        System.out.println("\n");
        System.out.println("The sum of the divisor is :" + sum);
        if (sum==n)
        {
            System.out.println("So,The Number is Not Perfect");
        }
        else
        {
            System.out.println("It Is Not Perfect Number");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        try
        {
            System.out.print("Enter the Number:");
            n=Integer.parseInt(sc.next());
            if (n < 0)
            {
                throw new IllegalArgumentException();
            }
            printDivisors(n);
        }
        catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.print("Enter the Number:");
            n = Integer.parseInt(sc.next());
            printDivisors(n);

        }

    }
}