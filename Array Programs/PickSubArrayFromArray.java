package assign.task.array;

public class PickSubArrayFromArray {
    public static void print(int[] arr1, int i, int j) {
        System.out.print("[" + i + ".." + j + "] -- { ");
        for(int k = i; k <= j; k++) {
            System.out.print(arr1[k] + " ");
        }
        System.out.println("}");
    }

    public static void pickSubarrayFromarray(int[] arr1, int n, int sum) {
        for(int i = 0; i < n; i++) {
            int sumUpto = 0;
            for(int j = i; j < n; j++) {
                sumUpto += arr1[j];
                if(sumUpto == sum) {
                    print(arr1, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, -7, 1, 3, 3, 1, -4};
        int sum = 7;
        int ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        pickSubarrayFromarray(arr1, ctr, sum);
    }
}
