package assign.task.apaar4;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        int  n,rem,rev=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the Number:");
            n =Integer.parseInt(sc.next());
            if(n<0) {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.print("Enter the Number:");
                n =Integer.parseInt(sc.next());
            }
        } catch(Exception e)
        {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.print("Enter the Number:");
            n =Integer.parseInt(sc.next());
        }
        while(n!=0) {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse Number Is: "+rev);
    }
}

