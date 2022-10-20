package assign.task.array;

public class Find2RepElement {
    public static void findElement(int[] arr, int arrSize) {
        System.out.print("The repeating elements are: ");
        for(int i = 0; i < arrSize; i++) {
            for(int j = i + 1; j < arrSize; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(" " + arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 7, 8, 3, 4};
        int ctr = arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        findElement(arr, ctr);
    }
}
