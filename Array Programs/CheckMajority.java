package assign.task.array;

public class CheckMajority {
    public static boolean chkMajority(int[] arr, int size, int x) {
        int lastIndex = size % 2 != 0 ? size / 2 + 1 : size / 2;
        for(int i = 0; i < lastIndex; i++) {
            if(arr[i] == x && arr[i + size / 2] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 4, 3, 2, 3, 3};
        int size = arr.length;
        int x = 3;
        System.out.print("The given array is :  ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("The given value is :  " + x);
        if(chkMajority(arr, size, x)) {
            System.out.print(x + " appears more than " + (size / 2) + " times in the given array[]");
        } else {
            System.out.print(x + " does not appear more than " + (size / 2) + " times in the given array[]");
        }
    }
}
