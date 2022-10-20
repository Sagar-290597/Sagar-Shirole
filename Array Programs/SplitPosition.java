package Array;

public class SplitPosition
{
    public static boolean canBalance(int[] arr1, int n) {
        for(int i = 0; i < n; i++)
        {
            int rhs = 0, lhs = 0;
            for(int k = 0; k < n; k++) {
                if(k > i) {
                    lhs += arr1[k];
                } else {
                    rhs += arr1[k];
                }
            }
            if(rhs == lhs) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 8, 4, 3, 2, 3, 3};
        int arrSize =arr1.length;
        boolean bl;

        System.out.print("The given array is :  ");
        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        bl = canBalance(arr1, arrSize);
        if(bl) {
            System.out.print("The array can be split in a position where the sum of both side are equal. ");
        } else {
            System.out.print("The array can not be split at any position where the sum of both side are equal. ");
        }
    }
}
