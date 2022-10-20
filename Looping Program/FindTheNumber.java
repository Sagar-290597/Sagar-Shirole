package assign.task.apaar4;

import java.util.Scanner;

public class FindTheNumber {
    public static void main(String[] args) {
        int i,sum=0;
        System.out.println("Numbers between 100 and 200, divisible by 9 :");

        for (i=100;i<=200;i++) {
            if(i%9==0) {
                System.out.print(i +" ");
                sum=sum+i;
            }
        }
        System.out.print("\n");
        System.out.println("The sum : "+sum);
    }
}
