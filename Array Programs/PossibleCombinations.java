package Array;

public class PossibleCombinations {
    public static void combinationDisplay(int[] arr1, int n, int r) {
        int[] data = new int[r];
        makeCombination(arr1, data, 0, n - 1, 0, r);
    }
    public static void makeCombination(int[] arr1, int[] data, int st, int end, int index, int r) {
        if(index == r) {
            for(int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = st; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr1[i];
            makeCombination(arr1, data, i + 1, end, index + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 4, 6, 8};
        int r = 4;
        int n =arr1.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The combination from by the number of elements are: " + r);
        System.out.println("The combinations are: ");
        combinationDisplay(arr1, n, r);
    }
}
