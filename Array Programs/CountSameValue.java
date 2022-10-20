package Array;

public class CountSameValue
{
    public static int countClumps(int[] arr, int n) {
        int current = 0, count= 0;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                current = arr[i];
                count++;
            } else if(arr[i] != current) {
                current = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {17, 42, 42, 7, 24, 24, 17, 54, 17};
        int n =arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("The number of clumps in the array is:  " + countClumps(arr, n));
    }
}
