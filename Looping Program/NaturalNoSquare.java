package assign.task.apaar2;

//Display the n terms of square natural number and their sum.
import java.util.InputMismatchException;
import java.util.Scanner;

public class NaturalNoSquare
{
    static int squaresum(int n)
    {
        int sum = 0,demo = 0;
        System.out.println("The square natural upto 5 terms are:");
        for (int i = 1; i <= n; i++) {
            System.out.print((i*i) +" ");
            demo=i*i;
            sum+=demo;
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
        System.out.println("The Sum of Square Natural Number upto "+ n+ " " +"terms:" +squaresum(n));
    }
}
