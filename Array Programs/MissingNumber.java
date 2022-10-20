package Array2;

import java.util.Scanner;

public class MissingNumber {
    public static int pickMissNumber(int[] array, int n) {
        int sum = 0, a = n + 1;
        for(int i = 0; i < n; i++) {
            sum = sum + array[i];
        }

        return (a * (a + 1)) / 2 - sum;
    }

    public static void main(String[] args) {

        int a,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int [] array = new int[n];

        for(int i =0;i<n;i++)
        {
            System.out.print("element --"+i+" -- ");
            array[i] = Integer.parseInt(sc.next());

        }
        System.out.println();
        System.out.println("The missing number is  : " + pickMissNumber(array, n) + " ");
    }
}
