package assign.task.apaar4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,count=0;
        try
        {
            System.out.println("Enter the Number To Check Prime Or Not:");
            num=Integer.parseInt(sc.next());
            if(num<0) {
                System.out.println("Invalid Input!..Please Enter Valid Input");
                System.out.println("Enter the Number To Check Prime Or Not:");
                num = Integer.parseInt(sc.next());
            }
        }catch(Exception e)
        {
            System.out.println("Invalid Input!..Please Enter Valid Input");
            System.out.println("Enter the Number To Check Prime Or Not:");
            num = Integer.parseInt(sc.next());
        }
        for(int i=1;i<=num;i++) {
            if(num % i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println("It Is Prime Number");
        } else {
            System.out.println("It Is Not Prime Number");
        }
    }
}
