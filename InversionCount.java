package Array2;

public class InversionCount {
    public static int invCount(int[] arr, int n) {
        int count = 0;
        System.out.print("The inversions are: ");
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    System.out.print("(" + arr[i] + ", " + arr[j] + ")  ");
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 6, 4, 5};
        int n =arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("\nThe number of inversion can be formed from the array is:  " + invCount(arr, n));
    }
}
