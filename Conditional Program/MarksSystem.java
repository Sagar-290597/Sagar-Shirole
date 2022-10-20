package assign.task.apaar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarksSystem
{
    public static void main(String args[])
    {
        int phy = 0, chem = 0, maths = 0,total;
        String rollno;
        String name;
        double percentage;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Name Of Candidate:");
        name =sc.next();

        System.out.print("Enter Roll Number:");
        rollno=sc.next();

        System.out.println("Enter Marks Of Subjects:");

        try {
            System.out.print("Enter Marks Of Physics Subjects:");
            phy = Integer.parseInt(sc.next());
            if (phy < 0)
            {
                throw new IllegalArgumentException();
            }

            System.out.print("Enter Marks Of Chemistry Subjects:");
            chem = Integer.parseInt(sc.next());
            if (chem < 0)
            {
                throw new IllegalArgumentException();
            }

            System.out.print("Enter Marks Of Maths Subjects:");
            maths = Integer.parseInt(sc.next());
            if (maths < 0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch (InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");

            System.out.print("Enter Marks Of Physics Subjects:");
            phy = Integer.parseInt(sc.next());

            System.out.print("Enter Marks Of Chemistry Subjects:");
            chem = Integer.parseInt(sc.next());

            System.out.print("Enter Marks Of Maths Subjects:");
            maths = Integer.parseInt(sc.next());

        }

        System.out.println("Candidate Name:"+ name);
        System.out.println("Candidate Roll Number:"+ rollno);
        total =  phy + chem + maths;
        if (total <= 300 && total>= 240)
        {
            System.out.println("Candidate is A Div");
        }
        if (total<= 240 && total>= 180 )
        {
            System.out.println("Candidate is B Div");
        }
        if (total<= 180)
        {
            System.out.println("Candidate is C Div");
        }

        percentage = (total / 300.0) * 100;
        System.out.println("Total marks ="+total);
        System.out.println("Percentage = "+percentage);

    }
}
