package assign.task.apaar2;

//Display the n terms of harmonic series and their sum.
//1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
import java.util.InputMismatchException;
import java.util.Scanner;

public class HarmonicSeries
{
    static double sum(int num)
    {
        double i, s = 0.0;
        for (i = 1; i <= num; i++)
            s = s + 1/i;
        return s;
    }


    // Driven Program
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num = 0;
        try
        {
        System.out.println("Input the number of terms:");
        num=Integer.parseInt(sc.next());
        }
        catch(InputMismatchException | NumberFormatException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Input the number of terms:");
            num=Integer.parseInt(sc.next());
        }
        System.out.printf("Sum is %f", sum(num));

    }
}
