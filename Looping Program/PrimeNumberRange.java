package assign.task.apaar4;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        int i,j ,n,nth,check= 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Starting Number here");
            n =  Integer.parseInt(sc.next());
            System.out.print("Enter  nth Number here");
            nth =  Integer.parseInt(sc.next());
            if(n<0 && nth<0 && n<nth) {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.print("Enter Starting Number here");
                n = Integer.parseInt(sc.next());
                System.out.print("Enter  nth Number here");
                n = Integer.parseInt(sc.next());
            }
        } catch(Exception e) {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.print("Enter Starting Number here");
            n = Integer.parseInt(sc.next());
            System.out.print("Enter  nth Number here");
            nth = Integer.parseInt(sc.next());
        }
        for ( i=n ; i <=nth; i++) {
            for (j = 2; j<=n; j++) {
                if (n % i == 0) {
                    check =1;
                    break;
                }
                if (check == 0) {
                    System.out.print(n + " ");
                }
            }
        }
    }
}


