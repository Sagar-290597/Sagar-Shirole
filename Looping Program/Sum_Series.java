package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum_Series
{
    static double Series(double x, int n)
    {
        double sum = 1, term = 1, fct, j, y = 2, m;

        int i;
        for (i = 1; i < n; i++) {
            fct = 1;
            for (j = 1; j <= y; j++) {
                fct = fct * j;
            }
            term = term * (-1);
            m = Math.pow(x, y) / fct;
            m = m * term;
            sum = sum + m;
            y += 2;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x;
        int n;
        try{
        System.out.println("Input the Value of x :" );
        x =Double.parseDouble(sc.next());
        System.out.println("Input the number of terms n: " );
        n=Integer.parseInt(sc.next());
        }
        catch (InputMismatchException | NumberFormatException e)
        {
            System.out.println("Invalid Input.");
            System.out.println("Enter Valid Input");
            System.out.println("Input the Value of x :" );
            x =Double.parseDouble(sc.next());
            System.out.println("Input the number of terms n: " );
            n=Integer.parseInt(sc.next());
        }
        System.out.println("The Sum is:" +Math.round(Series(x, n) *
                10000.0) / 10000.0);
    }
}
