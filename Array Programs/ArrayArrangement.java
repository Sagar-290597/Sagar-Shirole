package Array;

public class ArrayArrangement
{
    public static void arrayArrange(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
    public static void arrayPrinting(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 0};
        int n = arr.length;
        System.out.println("The Original array is ");
        arrayPrinting(arr, n);

        arrayArrange(arr, n);
        System.out.println("The modified array is: ");
        arrayPrinting(arr, n);
    }
}
