package assign.task.array;

public class MaximumProduct {
    public static void main(String[] args) {
        int arr[]={-4, 9, -7, 0, -15, 6, 2, -3};
        int prod=1;
        int size =arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("The maximum product of a sub-array in the given array is: ");
        for(int i = 0; i < size; i++) {
           prod*=arr[i];
            System.out.println(prod);
        }


    }
}
