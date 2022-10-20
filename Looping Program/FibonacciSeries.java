package assign.task.apaar4;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args) {
        int n,a=0,b=1,c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the Number: ");
            n =Integer.parseInt(sc.next());
            if(n<0)
            {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.print("Enter the Number: ");
                n =Integer.parseInt(sc.next());
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.print("Enter the Number: ");
            n =Integer.parseInt(sc.next());
        }
        System.out.print("The Fibonacci Series is:");
        System.out.print(a +" ");
        System.out.print(b +" ");

        for (int i = 2; i <= n-1; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c +" ");
        }
    }
}
