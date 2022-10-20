package Array2;

import java.util.Scanner;

public class MajorityElement {
    public static void MajorElement (int[] array, int n)
    {
        int index = 0, count = 1;

        for(int i = 1; i < n; i++) {
            if(array[index] == array[i]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                index = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++) {
            if(array[i] == array[index]) {
                count++;
            }
        }
        if(count > n / 2) {
            System.out.println("Majority Element : " + array[index]);
        } else {
            System.out.println("There are no Majority Elements in the given array.");
        }
    }
    public static void main(String[] args)
    {
        int a,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int [] array = new int[n];
        for(int i =0;i<n;i++) {
            System.out.print("element -"+i+"--> ");
            array[i] = Integer.parseInt(sc.next());
        }
        MajorElement(array ,n);
    }
}
