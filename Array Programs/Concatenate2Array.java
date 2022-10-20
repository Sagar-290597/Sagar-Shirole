package Array;

import java.util.Scanner;

public class Concatenate2Array 
{
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        int[] arr2 = {70, 80, 90, 100, 110, 120};
        int[] merge = new int[20];
        int i;
        for(i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
            System.out.print(merge[i] +" ");
        }
        int k=i;
        for(i = 0; i < arr2.length; i++) {
            merge[i] = arr2[i];
            System.out.print(merge[i] +" ");
        }
        k++;
        System.out.println("\nThe new array after merging is:");
        for(i = 0; i < k; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
