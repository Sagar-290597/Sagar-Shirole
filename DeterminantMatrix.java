package Array2;

import java.util.Scanner;

public class DeterminantMatrix {
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
        for(i = 0; i < 3; i++) {
            System.out.println();
            for( j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
        System.out.println("\n");
        int det=0;
        for(i=0;i<3;i++) {

            det = det + (array[0][i]*(array[1][(i+1)%3]*array[2][(i+2)%3]
                    - array[1][(i+2)%3]*array[2][(i+1)%3]));

        } System.out.print("The Determinant of the matrix is: "+det);

    }
}
