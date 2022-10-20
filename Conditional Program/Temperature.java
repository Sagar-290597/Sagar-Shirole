package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        try {
            System.out.print("Enter the temperature: ");
            temp =Integer.parseInt(sc.next());
        }
        catch (InputMismatchException | NumberFormatException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");

            System.out.println("Enter the temperature: ");
            temp = Integer.parseInt(sc.next());
        }

        if(temp<0)
        {
            System.out.println("Freezing Weather");
        }

        else if(temp>=0 && temp<10) {

            System.out.println("Very Cold Weather");
        }

        else if(temp>10 && temp<20) {

            System.out.println("Cold Weather");
        }

        else if(temp>=20 && temp<30) {

            System.out.println("Normal Weather");
        }
        else if(temp>=30 && temp<=40) {

            System.out.println("Normal In Temperature");
        }
        else if(temp>40) {

            System.out.println("Very Hot Weather");
        }

    }
}
