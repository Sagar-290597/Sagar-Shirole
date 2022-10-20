package Array;

public class FindThePair
{
    public static boolean pairFinding(int[] arr1, int size, int d) {
        int i = 0;
        int j = 1;

        while(i < size && j < size) {
            if(i != j && arr1[j] - arr1[i] == d) {
                System.out.print("The pair are: (" + arr1[i] + ", " + arr1[j] + ")");
                return true;
            } else if(arr1[j] - arr1[i] < d) {
                j++;
            } else {
                i++;
            }
        }

        System.out.print("No such pair found in the given array.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 15, 39, 75, 92};
        int size =arr1.length;
        int d = 53;
        System.out.println("The given array is:  ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The given difference is:  " + d);
        pairFinding(arr1, size, d);
    }
}
