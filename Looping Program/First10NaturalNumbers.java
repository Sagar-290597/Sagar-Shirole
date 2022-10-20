package assign.task.apaar3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First10NaturalNumbers
{
    public static void main(String[] args) {
        int sum=0 , temp;
        System.out.println("The first 10 natural number is :");

        for(int i=1;i<=10;i++) {
            System.out.print(i +" ");
            temp=i;
            sum += temp;
        }
        System.out.print("\n");
        System.out.println("The Sum Of First 10 Natural Numbers Is :" +sum);
    }
}
