package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EqualOrNot
{
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter The Number A:");
            a = Integer.parseInt(sc.next());
            System.out.println("Enter The Number B:");
            b = Integer.parseInt(sc.next());
            if (a < 0)
            {
                throw new IllegalArgumentException();
            }else if (b < 0)
            {
                throw new IllegalArgumentException();
            }

        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid Numbers");
            System.out.println("Enter valid Numbers");

            System.out.println("Enter The Number A:");
            a = Integer.parseInt(sc.next());
            System.out.println("Enter The Number B:");
            b = Integer.parseInt(sc.next());


        }
        if (a == b) {
            System.out.println("Numbers are Equal");
        } else {
            System.out.println("Numbers are not Equal");
        }

    }
}

