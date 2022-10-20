package assign.task.array;

public class LowIndex {
    public static int missingSmallElement(int[] arr1, int lowIndex, int highIndex) {
        if(lowIndex > highIndex) {
            return lowIndex;
        }
        int midIndex = lowIndex + (highIndex - lowIndex) / 2;

        if(arr1[midIndex] == midIndex) {
            return missingSmallElement(arr1, midIndex + 1, highIndex);
        } else {
            return missingSmallElement(arr1, lowIndex, midIndex - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 3, 4, 5, 6, 7, 9};
        int ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        int lowIndex = 0, highIndex = ctr - 1;
        System.out.print("The missing smallest element is: " + missingSmallElement(arr1, lowIndex, highIndex));
    }
}
