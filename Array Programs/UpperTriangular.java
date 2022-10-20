package Array2;

import java.util.Scanner;

public class UpperTriangular
{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of the square matrix : ");
        n = Integer.parseInt(sc.next());

        int[][] array = new int[6][6];

        System.out.println("Input elements in the matrix : ");
        for(i= 0; i < 3; i++) {
            for( j = 0; j < 3; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe matrix is : ");
        for(i = 0; i < 3; i++)
        {System.out.println();
            for( j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
        System.out.println("\n");
        System.out.print("Setting Zero In Upper Triagular Matrix");
        for(i = 0; i < 3; i++)
        {System.out.println();
            for( j = 0; j < 3; j++)
            {
                if (i>=j)
                {

                    System.out.print(array[i][j] + " ");}
                else {
                    System.out.print( 0 +" ");
                }

            }
        }
    }
}