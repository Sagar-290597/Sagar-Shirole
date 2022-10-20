package Array;

public class Rearrange3
{
    public static void rearrange(int[] arr1, int n) {
        int temp;
        for(int i = 0; i < n - 1; i++) {
            if(i % 2 == 0 && arr1[i] > arr1[i + 1]) {
                temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
            }
            if(i % 2 != 0 && arr1[i] < arr1[i + 1]) {
                temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
            }
        }
    }
    public static void dispArray(int[] arr1, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 4, 2, 1, 8, 3};
        int n = (int)arr1.length;
        System.out.println("The array given is: ");
        dispArray(arr1, n);
        rearrange(arr1, n);
        System.out.println("The new array after rearranging: ");
        dispArray(arr1, n);
    }
}
