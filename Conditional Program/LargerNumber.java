package assign.task.apaar;

import java.util.Scanner;

public class LargerNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try {
            System.out.println("Enter Three Numbers");
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            c = Integer.parseInt(sc.next());
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Three Numbers");

            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            c = Integer.parseInt(sc.next());
        }
        if ( a > b && a > c)
        {
            System.out.println("Largest Number is: "+ a);

        } else if ( b > a && b > c)
        {
            System.out.println("Largest Number is: "+ b);

        } else
        {
            System.out.println("Largest Number is: "+ c);
        }
    }
}
