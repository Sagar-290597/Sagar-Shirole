package assign.task.array;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,9,2};
        int n = arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n");
        int smallest=arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] < smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("The minimum element in the above array is: " +smallest);
    }
}
