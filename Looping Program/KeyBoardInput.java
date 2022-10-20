package assign.task.apaar3;

import java.util.Scanner;

public class KeyBoardInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = 0, number=0;
        float avg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number Is:");
            while (number < 1)
            {
                try {
                    n = Integer.parseInt(sc.next());
                    if (n > 0) {
                        sum += n;
                        break;
                    } else
                        System.out.println("Please,Enter the valid input");
                } catch (Exception e) {
                    System.out.println("Please,Enter the valid input");
                    System.out.print("Number Is:");
                    n = Integer.parseInt(sc.next());
                }
            }
        }
        avg = sum/10;
        System.out.println( "The sum of 10 number is::"+sum);
        System.out.println( "The avg of 10 number is::"+avg);
    }
}

