package assign.task.apaar4;

import java.util.Scanner;

public class AlphabeticPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.print("Enter the Number of Rows:");
            n =Integer.parseInt(sc.next());
            if(n<0) {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.print("Enter the Number of Rows:");
                n =Integer.parseInt(sc.next());
            }
        } catch(Exception e)
        {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.print("Enter the Number of Rows:");
            n =Integer.parseInt(sc.next());
        }
        char ch= 'A';
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }for(int j = 1; j <= i; j++) {
                System.out.print(" "+ (char)(j+64));
            }for(int j = i- 1; j >= 1; j--) {
                System.out.print(" "+(char)(j+64));
            }
            System.out.println();
        }
    }
}
