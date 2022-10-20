package Array;

public class MinimumDistance
{
    public static int findMinDistance(int[] input, int n1, int n2, int length) {
        int posOne = Integer.MAX_VALUE;
        int posTwo = Integer.MAX_VALUE;
        int d = length + 1;
        int newD;
        posOne = posTwo = d = length;

        for(int i = 0; i < length; i++) {
            if(input[i] == n1) {
                posOne = i;
            } else if(input[i] == n2) {
                posTwo = i;
            }

            if(posOne < length && posTwo < length) {
                newD = Math.abs(posOne - posTwo);
                if(d > newD) {
                    d = newD;
                }
            }
        }

        return d == length + 1 ? -1 : d;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 9, 5, 11, 7, 4, 12, 6, 2, 11};
        int n = (int)arr1.length;
        int p = 7;
        int q = 11;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The minimum distance between " + p + " and " + q + " is:  " + findMinDistance(arr1, p, q, n));
    }
}
