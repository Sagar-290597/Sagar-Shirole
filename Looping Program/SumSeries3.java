package assign.task.apaar2;

// find the sum of the series [ x - x^3 + x^5 + ......].
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumSeries3
{
    public static void main(String[] args) {
        int x,sum,ctr;
        int i,n,m,mm,nn;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Input the value of x :");
            x = Integer.parseInt(sc.next());
            System.out.println("Input number of terms :");
            n = Integer.parseInt(sc.next());
        }
        catch(InputMismatchException | NumberFormatException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Input the value of x :");
            x = Integer.parseInt(sc.next());
            System.out.println("Input number of terms :");
            n = Integer.parseInt(sc.next());
        }
        sum=x; m=-1;
        System.out.println("The values of the series:");
        System.out.println(+x);

        for(i = 1; i < n; i++) {
            ctr = 2 * i + 1;
            mm = (int)Math.pow(x, ctr);
            nn = mm * m;
            System.out.println(nn + " ");
            sum = sum + nn;
            m = m * -1;
        }
        System.out.println("\nThe sum is=" + sum);
    }
}
