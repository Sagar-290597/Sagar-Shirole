package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EligibleCriteria
{
    public static void main (String args[])

    {
        int age=0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Age:");
            age =Integer.parseInt(sc.next());

            if (age < 0)
            {
                throw new IllegalArgumentException();
            }
        }catch (InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Age");
            System.out.println("Enter valid Age");

            System.out.println("Enter Age:");
            age = Integer.parseInt(sc.next());
        }
        if(age > 18) {
            System.out.print("Congratulations! You Are Eligible For Casting Your Vote");
        } else {
            System.out.print("You Are Not Eligible");
        }

    }
}
