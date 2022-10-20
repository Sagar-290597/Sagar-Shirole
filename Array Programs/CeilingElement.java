package assign.task.array;

public class CeilingElement 
{
    public static int findCeiling(int[] arr, int low, int high, int x) {
        if(x <= arr[low]) {
            return low;
        }
        for(int i = low; i < high; i++) {
            if(arr[i] == x) {
                return i;
            }

            if(arr[i] < x && arr[i + 1] >= x) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 9, 9, 10};
        int ctr = arr.length;
        int x = 5;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int index = findCeiling(arr, 0, ctr - 1, x);
        if(index == -1) {
            System.out.print("No ceiling for the number " + x + "  exists in array. ");
        } else {
            System.out.print("The ceiling of " + x + " is: " + arr[index]);
        }
    }
}
