package assign.task.apaar4;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, count=0;
        String s = "";
        try {
            System.out.print("Enter the Decimal number: ");
            n = Integer.parseInt(sc.next());
            if (n==1 && n==0)
            {
                System.out.print("The Decimal Number : ");
                n = Integer.parseInt(sc.next());
            } else {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.print("The Decimal Number : ");
                n =Integer.parseInt(sc.next());
            }
        } catch(Exception e) {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.print("Enter the Decimal number: ");
            n =Integer.parseInt(sc.next());
        }
        while(n>0) {
            a = n % 2;
            s = s + " " + a;
            n = n / 2;
        }
            System.out.println("The equivalent Binary Number is : " + s );
    }
}
