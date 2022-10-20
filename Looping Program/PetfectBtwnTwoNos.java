package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PetfectBtwnTwoNos
{
    static boolean perfect(int num)
    {
        int sum = 0;
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
            {
                sum = sum+i;
            }
        }
        if(sum==num) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner (System.in);
        int n;
        try {
            System.out.println("Enter the First Number:");
            n = Integer.parseInt(obj.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
            System.out.println("Enter the Second Number");
            n = Integer.parseInt(obj.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Enter Starting Point:");
            n = Integer.parseInt(obj.next());
            System.out.println("Enter Ending Point");
            n = Integer.parseInt(obj.next());
        }

        System.out.println("The Perfect numbers within the given range :");
        for(int i=1; i<=n; i++)
        {
            if(perfect(i))
                System.out.println(i);
        }
    }
}
