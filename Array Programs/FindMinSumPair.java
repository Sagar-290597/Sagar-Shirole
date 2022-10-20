package assign.task.array;

public class FindMinSumPair {
    public static void findMinSumPair(int[] arr, int arrSize) {
        int sum, minSum, min1pair, min2pair;
        min1pair = arr[0];
        min2pair = arr[1];
        minSum = min1pair + min2pair;

        for(int i = 0; i < arrSize - 1; i++) {
            for(int j = i + 1; j < arrSize; j++) {
                sum = arr[i] + arr[j];
                if(Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    min1pair = arr[i];
                    min2pair = arr[j];
                }
            }
        }
        System.out.println("[" + min1pair + ", " + min2pair + "]");
    }

    public static void main(String[] args) {
        int[] arr = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};
        int size =arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("The Pair of elements whose sum is minimum are: ");
        findMinSumPair(arr, size);
    }
}
