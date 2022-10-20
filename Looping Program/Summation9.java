package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Summation9 {
    static int summation(int n)
    {
        int sum = 0, j = 9;
        for (int i = 1; i <= n; i++)
        {
            sum = sum + j;
            j = (j * 10) + 9;
            System.out.print(j +" ");
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
        System.out.println("TThe sum of the series :" +summation(n));
    }
}
