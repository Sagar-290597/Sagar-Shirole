package assign.task.array;

public class Soring012
{
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 1, 0, 0, 1};
        int n =arr.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.print("\n");
        System.out.print  ("The array after sorting is:");
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
        for(int i = 0; i < n; i++) {
            if(arr[i] == 2) {
                System.out.print(arr[i] +" ");
            }
        }
    }

}
