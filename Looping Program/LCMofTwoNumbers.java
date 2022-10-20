package assign.task.apaar4;

import java.util.Scanner;

public class LCMofTwoNumbers
{
    public static void main(String[] args) {
        int  a = 0,b = 0,gcd=0,i,lcm = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter 1st the Number:");
            a =Integer.parseInt(sc.next());

            System.out.print("Enter the Number:");
            b =Integer.parseInt(sc.next());
            if(a<0  && b<0) {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.print("Enter 1st the Number:");
                a =Integer.parseInt(sc.next());
                System.out.print("Enter the Number:");
                b =Integer.parseInt(sc.next());
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.print("Enter 2nd the Number:");
            a =Integer.parseInt(sc.next());
            System.out.print("Enter the Number:");
            b =Integer.parseInt(sc.next());
        }
        for(i=1;i<=a;i++)
            if(a%i==0 && b%i==0) {
                gcd=i;
            }
        lcm=a*b/gcd;
        System.out.println("LCM = "+lcm);
    }
}

