package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuDrivenCalculation
{
    public static void main(String[] args)
    {
        float a, b, add ,sub,mul,div;
        int num;
        Scanner sc = new Scanner(System.in);

        try
        {
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter Task Number: ");
        num =Integer.parseInt(sc.next());
            if (num < 0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");

            System.out.print("Enter Task Number: ");
            num =Integer.parseInt(sc.next());
        }
        if(num>=1 && num<=4)
        {
            System.out.print("Enter any Two Number: ");
            a = sc.nextFloat();
            b = sc.nextFloat();

            if( num==1)
            {
                add = a+b;
                System.out.printf("The Addition of =" +add);
            }
            else if( num==2)
            {
                sub = a-b;
                System.out.printf("The Subtraction of =" +sub);
            }
            else if( num==3)
            {
                mul = a*b;
                System.out.printf("The Multiplication of =" +mul);
            }
            else if(num==4)
            {
                div = a/b;
                System.out.printf("The Division of =" +div);
            }
        }
        else
        {
            System.out.println("Invalid Choice!");
        }
    }
}
