package assign.task.apaar4;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Row : ");
        n = sc.nextInt();

        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            int a=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
                a=a*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
