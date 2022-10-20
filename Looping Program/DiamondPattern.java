package assign.task.apaar4;

import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        try
        {
            System.out.println("Enter the Number To Print Pattern:");
            number=Integer.parseInt(sc.next());
            if(number<0) {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.println("Enter the Number To Print Pattern:");
                number = Integer.parseInt(sc.next());
            }
        }catch(Exception e)
        {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.println("Enter the Number To Print Pattern:");
            number = Integer.parseInt(sc.next());
        }

        int r, c;
        for (r = 1; r <= number; r++) {
            // Inner loop 1 print whitespaces
            for (c = 1; c <= number - r; c++) {
                System.out.print(" ");
            }
            // Inner loop 2 prints star
            for (c = 1; c <= r * 2 - 1; c++) {
                System.out.print("*");
            }
            // Ending line after each row
            System.out.println();
        }
        //print Another half
        for (r = number - 1; r > 0; r--) {

            // Inner loop 1 print whitespaces
            for (c = 1; c <= number - r; c++) {
                System.out.print(" ");
            }
            // Inner loop 2 print star
            for (c = 1; c <= r * 2 - 1; c++) {
                System.out.print("*");
            }
            // Ending line after each row
            System.out.println();
        }
    }
}
