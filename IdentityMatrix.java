package Array2;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        int row, column, i=0, j=0;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of rows in the matrix : ");
        row = Integer.parseInt(sc.next());
        System.out.print("Input the number of columns in the matrix : ");
        column = Integer.parseInt(sc.next());
        int[][] array = new int[6][6];

        System.out.println("Input elements in the matrix : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
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
                for (j = 0; j < column; j++) {
                    if (array[i][j] != 1 && array[j][i] != 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("The matrix is an identity matrix.");
            } else {
                System.out.println("The matrix is not an identity matrix.");
            }
    }
}