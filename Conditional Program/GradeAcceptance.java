package assign.task.apaar;

import java.util.Scanner;

public class GradeAcceptance
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.println("Enter Grade Varying from E,V,G,A,F");
        a =sc.next().charAt(0);

        if(a == 'E' || a == 'e')
        {
            System.out.println("You have chosen: Excellent");
        }
        else if(a == 'V' || a == 'v')
        {
            System.out.println("You have chosen: Best");
        }
        else if(a == 'G' || a == 'g')
        {
            System.out.println("You have chosen: Good ");
        }
        else if(a == 'A' || a == 'a')
        {
            System.out.println("You have chosen: Average");
        }
        else if(a == 'F' || a == 'f')
        {
            System.out.println("You have chosen: Poor ");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
