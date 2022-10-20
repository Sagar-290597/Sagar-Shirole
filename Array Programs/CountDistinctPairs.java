package Array;

import java.util.Arrays;

public class CountDistinctPairs {
    public static void main(String[] args) {
        int n, k;
        int count = 0;
        int[] array = {5, 2, 3, 7, 6, 4, 9, 8};
        n =array.length;
        k = 5;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        Arrays.sort(array, 0, n);
        int l = 0;
        int r = 0;
        System.out.print("The distinct pairs for difference " + k + " are: ");
        while(r < n) {
            if(array[r] - array[l] == k) {
                System.out.print("[" + array[r] + ", " + array[l] + "] ");
                count++;
                l++;
                r++;
            } else if(array[r] - array[l] > k) {
                l++;
            } else {
                r++;
            }
        }
        System.out.print("\nNumber of distinct pairs for difference " + k + " are: " + count);
    }
}

