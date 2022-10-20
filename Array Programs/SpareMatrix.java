package Array2;

import java.util.Scanner;

public class SpareMatrix {
    public static void main(String[] args) {
        int n,i,j,row,col,z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of the square matrix : ");
        n = Integer.parseInt(sc.next());
        System.out.print("Input the number of rows of the matrix : ");
        row = Integer.parseInt(sc.next());
        System.out.print("Input the number of columns of the matrix : ");
        col = Integer.parseInt(sc.next());

        int[][] array = new int[6][6];

        System.out.println("Input elements in the matrix : ");
        for(i= 0; i < 3; i++) {
            for( j = 0; j < 3; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array[i][j] = sc.nextInt();
                if(array[i][j] == 0) {
                    ++z;
                }
            }
        }

        System.out.println("\nThe matrix is : ");
        for(i = 0; i < 3; i++) {
            System.out.println();
            for( j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
        if(z > (row * col) / 2) {
            System.out.println("The given matrix is sparse matrix. ");
        } else {
            System.out.println("The given matrix is not a sparse matrix.");
        }
        System.out.println("There are " + z + " number of zeros in the matrix.");
    }
}
