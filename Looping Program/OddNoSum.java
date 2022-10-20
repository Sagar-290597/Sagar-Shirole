package assign.task.apaar3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddNoSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        try {
            System.out.println("Input Number Of Terms For Odd Natural Number:");
            num = Integer.parseInt(sc.next());
            if(num<0)
            {
                throw new IllegalArgumentException();
            }
        }catch(InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Input Number Of Terms For Odd Natural Number:");
            num = Integer.parseInt(sc.next());
        }
        int sum = 0;
        System.out.print("The odd numbers are:");
        int counter = 0;
        for (int i = 1; counter < num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                counter++;
                sum += i;
            }
        }
        System.out.print("\n");
        System.out.println("The Sum is:" + sum);
    }
}
