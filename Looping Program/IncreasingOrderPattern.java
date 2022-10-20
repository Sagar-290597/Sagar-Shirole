package assign.task.apaar3;

import java.util.Scanner;

public class IncreasingOrderPattern
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        try {
            System.out.println("Enter The Number Of Terms:");
            n=Integer.parseInt(sc.next());
            if(n<0) {
                System.out.println("Invalid Input..Please Enter Valid Input");
                System.out.println("Input the number (Table to be calculated) :");
                n=Integer.parseInt(sc.next());
            }
        } catch (Exception e)
        {
            System.out.println("Invalid Input..Please Enter Valid Input");
            System.out.println("Input the number (Table to be calculated) :");
            n=Integer.parseInt(sc.next());
        }
        int i=1;
        for (int r=1;r<=n;r++){

            for (int c=1;c<=r;c++)
            {
                if(r>=c)
                {
                    System.out.print(i++ +" ");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
