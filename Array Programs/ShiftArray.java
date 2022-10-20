package assign.task.array;

public class ShiftArray {
    public static void shiftarrpos(int[] arr, int arrSize) {
        int i, temp;
        temp = arr[0];
        for(i = 0; i < arrSize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }
    public static void arrrotate(int[] arr, int arrSize, int rotFrom) {
        for(int i = 0; i < rotFrom; i++) {
            shiftarrpos(arr, arrSize);
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27};
        int ctr = arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("From 4th position the values of the array are :  ");
        for(int i = 4; i < ctr; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("Before 4th position the values of the array are :  ");
        for(int i = 0; i < 4; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        arrrotate(arr, ctr, 4);
        System.out.println("\nAfter rotating from 4th position the array is: ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
