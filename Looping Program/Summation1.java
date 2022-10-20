package assign.task.apaar2;
// Java program to find the sum of
// the series 1+11+111+1111+....

import java.util.InputMismatchException;
import java.util.Scanner;

class Summation1
{
    static int summation(int n)
    {
        int sum = 0, j = 1;
        for (int i = 1; i <= n; i++)
        {
            sum = sum + j;
            j = (j * 10) + 1;
            System.out.print(j +"+");
        }
        System.out.println("\n");
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Input number of terms :");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Input number of terms :");
            n = Integer.parseInt(sc.next());
        }
        System.out.println("The Sum is:" +summation(n));
    }
}
