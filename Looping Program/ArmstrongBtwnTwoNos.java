package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ArmstrongBtwnTwoNos {
    public static void main(String args[]){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        try
        {
        System.out.println("Enter the First Number:");
        num1 = Integer.parseInt(sc.next());
        if(num1<0)
        {
            throw new IllegalArgumentException();
        }
        System.out.println("Enter the Second Number");
        num2 = Integer.parseInt(sc.next());
        if(num2<0)
        {
            throw new IllegalArgumentException();
        }
    }
        catch(InputMismatchException | IllegalArgumentException e)
    {
        System.out.println("Invalid Input");
        System.out.println("Enter Valid Input");
        System.out.println("Enter Starting Point:");
        num1 = Integer.parseInt(sc.next());
        System.out.println("Enter Ending Point");
        num2 = Integer.parseInt(sc.next());
    }
        System.out.println("Armstrong numbers in given range are:");
        for (int i = num1; i<num2; i++)
        {
            int check, rem, sum = 0;
            check = i;

            while(check != 0)
            {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.print(i +" ");
            }
        }
    }
}
