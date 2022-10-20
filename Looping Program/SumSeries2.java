package assign.task.apaar2;

//display the sum of the series [ 1+x+x^2/2!+x^3/3!+....].
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumSeries2
{
    static double sum(int x, int n)
    {
        int i;
        double total = 1;
        for (i = 1; i <= n; i++)
        {
            total = total +
                    (Math.pow(x, i) / i);
        }
        return total;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,n;
        try{
            System.out.println("Input the Value of x :" );
            x =Integer.parseInt(sc.next());
            System.out.println("Input the number of terms n: " );
            n =Integer.parseInt(sc.next());
        }
        catch (InputMismatchException | NumberFormatException e)
        {
            System.out.println("Invalid Input.");
            System.out.println("Enter Valid Input");
            System.out.println("Input the Value of x :" );
            x =Integer.parseInt(sc.next());
            System.out.println("Input the number of terms n: " );
            n =Integer.parseInt(sc.next());
        }
        System.out.printf("The Sum is %.2f", sum(x, n));
    }
}
