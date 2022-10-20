package assign.task.array;

public class NumberOfJumps {
    public static int noOfJumps(int[] arr, int low, int high) {
        if(high == low) {
            return 0;
        }
        if(arr[low] == 0) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for(int i = low + 1; i <= high && i <= low + arr[low]; i++) {
            int jumps = noOfJumps(arr, i, high);
            if(jumps != Integer.MAX_VALUE && jumps + 1 < min) {
                min = jumps + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9, 1, 1, 1};
        int n = arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("The minimum of number of jumps is required to reach the end is:  " + noOfJumps(arr, 0, n - 1) + " ");
    }
}
