package Array;

public class MaximumElement
{
    public static int firstIncreDecre(int[] arr, int n) {
        int maxele = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > maxele) {
                maxele = arr[i];
            }
        }
        return maxele;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 12, 25, 4, 57, 27, 44};
        int n =arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("The maximum element which is increasing then decreasing is: " + firstIncreDecre(arr, n) + " ");
    }
}