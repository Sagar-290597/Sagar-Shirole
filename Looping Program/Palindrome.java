package assign.task.apaar4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       int temp,n,d,rev=0;
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
        temp = n;
        while(n>0) {
            d = n % 10;
            rev=rev*10+d;
            n=n/10;

        }
        if(temp==rev)
        {
            System.out.println(temp+ " is Palindrome Number");
        }
    }
}
