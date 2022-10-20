package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HeightCheck {
    public static void main(String args[])
    {
        int ht;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the Height of a Person:");
            ht = Integer.parseInt(sc.next());
            if (ht < 0) {
                throw new IllegalArgumentException();
            }
        }
        catch (InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Height");
            System.out.println("Enter valid Input");

            System.out.print("Enter the Height of a Person:");
            ht = Integer.parseInt(sc.next());
        }


        if(ht > 175)
        {
            System.out.println("The person Is Tall.");
        }
        else if(ht > 155 && ht <= 175)
        {
            System.out.println("The Person Has Average Height.");
        }
        else
        {
            System.out.println("The Person Is Dwarf.");
        }

    }
}
