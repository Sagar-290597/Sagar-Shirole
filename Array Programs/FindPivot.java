package assign.task.array;

public class FindPivot {
    public static int findPivotElem(int[] arr, int leftele, int rightele) {
        if(rightele < leftele) {
            return -1;
        }
        if(rightele == leftele) {
            return leftele;
        }
        int midele = (leftele + rightele) / 2;
        if(midele < rightele && arr[midele] > arr[midele + 1]) {
            return midele;
        }
        if(midele > leftele && arr[midele] < arr[midele - 1]) {
            return midele - 1;
        }
        if(arr[leftele] >= arr[midele]) {
            return findPivotElem(arr, leftele, midele - 1);
        } else {
            return findPivotElem(arr, midele + 1, rightele);
        }
    }

    public static void main(String[] args) {
        int[] arr = {14, 23, 7, 9, 3, 6, 18, 22, 16, 36};
        int size = arr.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("The Pivot Element in the array is : " + arr[findPivotElem(arr, 0, size - 1) + 1] + " ");
    }
}
