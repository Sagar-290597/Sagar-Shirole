package assign.task.array;

public class CheckSubsetArray {
    public static boolean chkSubsetArray(int[] arr1, int arr1Size, int[] arr2, int arr2Size) {
        int j;
        for(int i = 0; i < arr2Size; i++) {
            for(j = 0; j < arr1Size; j++) {
                if(arr2[i] == arr1[j]) {
                    break;
                }
            }
            if(j == arr1Size) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 8, 7, 11, 6, 9, 5, 0, 2};
        int[] arr2 = {5, 4, 2, 0, 6};
        int n1 =arr1.length;
        int n2 =arr2.length;
        System.out.print("The given first array is :  ");
        for(int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("The given second array is :  ");
        for(int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + "  ");
        }
        System.out.println();
        if(chkSubsetArray(arr1, 9, arr2, 4)) {
            System.out.print("The second array is the subset of first array.");
        } else {
            System.out.print("The second array is not a subset of first array");
        }
    }
}
