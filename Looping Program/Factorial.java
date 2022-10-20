package assign.task.apaar3;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        int i, fact = 1, n = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter The Number Of Terms:");
            n=Integer.parseInt(sc.next());
            if(n<0) {
                System.out.println("Invalid Input..Please Enter Valid Input");
                System.out.println("Enter The Number Of Terms:");
                n=Integer.parseInt(sc.next());
            }
        } catch (Exception e) {
            System.out.println("Invalid Input..Please Enter Valid Input");
            System.out.print("Enter The Number Of Terms: ");
            n = Integer.parseInt(sc.next());
        }
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n +" is: " + fact);
    }
}
