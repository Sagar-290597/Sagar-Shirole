package Array2;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        int row, column, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of rows & columns in the matrix : ");
        row = Integer.parseInt(sc.next());
        column = Integer.parseInt(sc.next());
        int[][] array = new int[6][6];

        System.out.println("Input elements in the matrix : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe matrix is : ");
        for (i = 0; i < row; i++) {
            System.out.println();

            for (j = 0; j < column; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
        System.out.println("\n");
        for (i = 0; i < row; i++) {
            if (row != column) {
                System.out.print("Matrix should be a square matrix");
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if ((i == j && array[i][j] != 1) || (i != j && array[i][j] != 0)) {
                    System.out.print("The matrix is an identity matrix.");
                }
            }
        }
    }
}
