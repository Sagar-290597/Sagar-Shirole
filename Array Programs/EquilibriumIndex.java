package Array;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {0, -4, 7, -4, -2, 6, -3, 0};
        System.out.println("Original array: "+Arrays.toString(arr));
        equlibriumindices(arr);
    }
    public static void equlibriumindices(int[] arr){
        int totalSum = 0;
        for (int n : arr) {
            totalSum += n;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (totalSum - sum - n == sum) {
                System.out.println("Equilibrium indices found at : "+i);
            }
            sum += n;
        }
    }
}