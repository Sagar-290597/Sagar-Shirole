package Array2;

import java.util.Scanner;

public class OddNumbers {
    static int getOddOccurrence(int[] array, int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return array[i];
            }
        }
        return -1;
    }

    public static int main(String[] args)
    {
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
        System.out.println("\nNumber which occurs odd number of times: " +getOddOccurrence(array ,n)+" ");
        return 0;
    }

}
