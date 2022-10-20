package Array;

public class UpdateElement {
    public static void newArrayPrevNext(int[] arr, int n) {
        int preElem = arr[0];
        arr[0] = arr[0] * arr[1];
        for(int i = 1; i < n - 1; i++) {
            int curElem = arr[i];
            arr[i] = preElem * arr[i + 1];
            preElem = curElem;
        }
        arr[n - 1] = preElem * arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("The new array is: ");
        newArrayPrevNext(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
