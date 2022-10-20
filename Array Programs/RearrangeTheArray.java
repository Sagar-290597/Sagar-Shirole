package Array;

public class RearrangeTheArray 
{
    public static int arrayRearrange(int[] arr, int l) {
        for(int i = 0; i < l; i++) {
            if(arr[i] != -1 && arr[i] != i) {
                int x = arr[i];
                while(arr[x] != -1 && arr[x] != x) {
                    int y = arr[x];
                    arr[x] = x;
                    x = y;
                }
                arr[x] = x;
                if(arr[i] != i) {
                    arr[i] = -1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 6, -1, 8, 7, -1, 9, 1};
        int n = arr.length;
        int i = 0;
        System.out.println("The given array is:  ");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        System.out.print("The new array is: ");
        arrayRearrange(arr, n);
        for(int i2 = 0; i2 < n; i2++) {
            System.out.print(arr[i2] + "  ");
        }
    }
}
