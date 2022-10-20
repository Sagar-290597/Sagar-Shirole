package assign.task.apaar4;

import java.util.Scanner;

public class LCMtoHCF
{
    public static void main(String[] args) {
        int n1=0, n2=0,lcm = 0,hcf=1;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter 1st the Number:");
            n1 =Integer.parseInt(sc.next());
            System.out.print("Enter 2nd the Number:");
            n2 =Integer.parseInt(sc.next());
            if(n1<0  && n2<0) {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.print("Enter 1st the Number:");
                n1 =Integer.parseInt(sc.next());
                System.out.print("Enter 2nd the Number:");
                n2 =Integer.parseInt(sc.next());
            }
        }
        catch(Exception e) {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.print("Enter 1st the Number:");
            n1 =Integer.parseInt(sc.next());
            System.out.print("Enter 2nd the Number:");
            n2 =Integer.parseInt(sc.next());
        }
         int j = n1 < n2 ? n1 : n2;

        for(int i = 1; i <= j; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        lcm = (n1 * n2) / hcf;
        System.out.println("\nThe LCM of " + n1 + " and " + n2 + " is : " + lcm + "\n");
    }
}
