package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) {
		
	        Scanner sc =new Scanner(System.in);

	        int arm=0,rem,n;
	        try {
	            System.out.print("Enter the Number:");
	            n = Integer.parseInt(sc.next());
	            if (n < 0) {
	                throw new IllegalArgumentException();
	            }
	        } catch(InputMismatchException | IllegalArgumentException e)
	        {
	            System.out.println("Invalid Input");
	            System.out.println("Enter Valid Input");
	            System.out.print("Enter the Number:");
	            n =Integer.parseInt(sc.next());
	        }
	        int temp =n;
	        while(n>0)
	        {
	            rem=n% 10;
	            arm =(rem*rem*rem)+arm;
	            n = n /10;
	        }
	        if (temp==arm)
	        {
	            System.out.print(temp+ " It is an Armstrong Number");
	        }
	        else
	        {
	            System.out.print(temp + "It is not Armstrong Number");
	        }
	    }

	}

