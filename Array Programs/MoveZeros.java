package assign.task.array;

public class MoveZeros {
    public static void pickOutZeros(int[] arr, int arrSize) {
        int tmp, left = 0, right = arrSize - 1;
        while(right > left) {
            while(arr[left] != 0) {
                left++;
            }
            while(arr[right] == 0) {
                right--;
            }
            if(left < right) {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 0, 4, 0, 7, -5, 8, 0};
        int n = arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        pickOutZeros(arr, n);
        System.out.println("The new array is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
