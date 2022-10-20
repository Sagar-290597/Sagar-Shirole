package Array;

public class SegregateEvenOdd
{
    public static void main(String[] args) {
        int[] arr = {17, 42, 19, 7, 27, 24, 30, 54, 73};
        int n =arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.print("\n");
        System.out.print  ("The array after segregation is:");
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0 ) {
                System.out.print(arr[i] +" ");
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] +" ");
            }
        }
    }

}
