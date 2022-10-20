package Array2;

import java.util.Scanner;

public class ContiguousMatrix {
    public static int maxSum(int[] array, int n)
    {
        int sum, maxSum = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++) {
                sum = 0;
                for(int k = i; k <= j; k++)
                {
                    sum = sum + array[k];
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int [] array = new int[n];

        for(int i =0;i<n;i++)
        {
            System.out.print("element -"+i+"--> ");
            array[i] = Integer.parseInt(sc.next());

        }
        System.out.println();
        System.out.println("The largest sum of contiguous subarray is : " + maxSum(array, n) + " ");
    }
}
