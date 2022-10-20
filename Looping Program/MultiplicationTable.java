package assign.task.apaar3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i, j, n = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input upto the table number starting from 1 to :");
            n = Integer.parseInt(sc.next());
            if (n < 0) {
                System.out.println("Invalid Input..Please Enter Valid Input");
                System.out.print("Input upto the table number starting from 1 :");
                n=Integer.parseInt(sc.next());
            }
        } catch (Exception e) {
            System.out.println("Please,Enter valid input");
            System.out.print("Input upto the table number starting from 1 :" );
            n = Integer.parseInt(sc.next());
        }
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(j + "x" + i + " = " + (i * j) + ", ");
            }
            System.out.println();
        }
    }
}