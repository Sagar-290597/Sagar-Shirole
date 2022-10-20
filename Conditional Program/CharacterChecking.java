package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterChecking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        try
        {
            System.out.println("Enter Number For Checking Character:");
            ch = Integer.parseInt(sc.next());
        }
        catch(InputMismatchException | NumberFormatException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Enter Number For Checking Character:");
            ch =Integer.parseInt(sc.next());
        }
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
        {
            System.out.println("It IS An Alphabet");
        }
        else if (ch >= 48 && ch <= 57)
        {
            System.out.println("It IS A Digit");
        }
        else if((ch >= 58 && ch <= 64))
        {
            System.out.println("It IS A Special Character ");
        }
        else
        {
            System.out.println("Invalid...");
        }

    }
}
