package Array;

public class Segregate01
{
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 0, 1, 1};
        int n =arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.print("\n");
        System.out.print  ("The array after segregation is:");
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                System.out.print(arr[i] +" ");
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                System.out.print(arr[i] +" ");
            }
        }
    }

}
