package Array;

public class PeakElementOfArray
{
    public static int findPeakUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2; /* (low + high)/2 */

        if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        } else if(mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeakUtil(arr, low, mid - 1, n);
        } else {
            return findPeakUtil(arr, mid + 1, high, n);
        }
    }
    public static int findPeak(int[] arr, int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 13, 20, 16, 19, 11, 7, 25};
        int n = arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n");
        System.out.print("The index of first peak element in the array is: " + findPeak(arr, n));
    }
}