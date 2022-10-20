package assign.task.apaar3;

import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args) {
        int j,num;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Input the number (Table to be calculated) :");
            num=Integer.parseInt(sc.next());
            if(num<0) {
                System.out.println("Invalid Input..Please Enter Valid Input");
                System.out.println("Input the number (Table to be calculated) :");
                num=Integer.parseInt(sc.next());
            }
        } catch (Exception e)
        {
            System.out.println("Invalid Input..Please Enter Valid Input");
            System.out.println("Input the number (Table to be calculated) :");
            num=Integer.parseInt(sc.next());
        }
        for(j=1;j<=10;j++)
            System.out.println(num+" X "+j+" = " +num*j);
    }
}

