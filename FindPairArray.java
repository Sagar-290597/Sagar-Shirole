package Array2;

import java.util.Scanner;

public class FindPairArray {
    public static void findPair(int[] array,int n, int a) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <n ; j++)
            {
                if (array[i] + array[j] == a) {
                    System.out.printf("Pair of elements can make the given sum by the value of index " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }

    public static void main(String[] args)
    {
        int a,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());
        System.out.println("The Given Sum : ");
        a = Integer.parseInt(sc.next());
        int [] array = new int[n];

        for(int i =0;i<n;i++)
        {
            System.out.print("element -"+i+"--> ");
            array[i] = Integer.parseInt(sc.next());

        }
        findPair(array ,n,a);
    }
}
