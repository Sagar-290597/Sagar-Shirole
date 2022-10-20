package Array;

public class MaxDifference {
    public static int findMaxDifference(int[] arr, int arrSize) {
        int diff = 0;
        for(int m = 0; m < arrSize; ++m) {
            for(int n = arrSize - 1; n > m; --n) {
                if(arr[n] > arr[m] && diff < n - m) {
                    System.out.println("m = " +m+ ", n = " +n+ ", arr[m] =  " +arr[m]+ " arr[n] = " +arr[n]+ " difference = " +(n - m));
                    diff = n - m;
                }
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 2, 3, 2, 4, 2, 1, 0};
        int n =arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int diff = findMaxDifference(arr, n);
        System.out.print("\nThe maximum differences between two position of array index is: " + diff);
    }
}
