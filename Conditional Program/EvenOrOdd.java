package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        try {
            System.out.println("Enter The Number");
            n = Integer.parseInt(sc.next());
            if (n < 0)
            {
                throw new IllegalArgumentException();
            }

        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid Number");
            System.out.println("Enter valid Number");

            System.out.println("Enter The Number");
            n = Integer.parseInt(sc.next());

        }
        if (n%2==0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

    }
}

