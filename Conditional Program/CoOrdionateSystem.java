package assign.task.apaar;

import java.util.Scanner;

public class CoOrdionateSystem
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y;
        try {
            System.out.println("Enter X Co-ordinate:");
            x =Integer.parseInt(sc.next());
            System.out.println("Enter Y  Co-ordinate:");
            y =Integer.parseInt(sc.next());

        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter X co-ordinate");
            x =Integer.parseInt(sc.next());
            System.out.println("Enter Y  co-ordinate");
            y =Integer.parseInt(sc.next());

        }
        if (x > 0 && y > 0) {
            System.out.println("Co-ordinates in 1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Co-ordinates in 2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Co-ordinates in 3rd Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Co-ordinates in 4th Quadrant");
        } else if (x == 0 && y < 0) {
            System.out.println("Co-ordinates on +Y-axis");
        } else if (x == 0 && y < 0) {
            System.out.println("Co-ordinates on -Y-axis");
        } else if (y == 0 && x < 0) {
            System.out.println("Co-ordinates on +X-axis");
        } else if (y == 0 && x < 0) {
            System.out.println("Co-ordinates on -X-axis");
        } else {
            System.out.println("Co-ordinates on Origin");
        }
    }
}
