package assign.task.array;

public class CountingSort {
    public static void countingSort(int[] arr, int n, int max) {
        int[] count = new int[50];
        for(int i = 0; i < n; ++i) {
            count[arr[i]] = count[arr[i]] + 1;
        }
        System.out.print("After sorting the elements in the array are:  ");
        for(int i = 0; i <= max; ++i) {
            for(int j = 1; j <= count[i]; ++j) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int max = 0;
        int[] arr = {4, 14, 8, 0, 2, 5, 2, 1, 0, 17, 9, 0, 5};
        int n = arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        countingSort(arr, n, max);
    }
}
