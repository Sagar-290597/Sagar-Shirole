package Array;

public class MaxRepeatingNo {
    static int maxRepeating(int arr[], int n)
    {
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        int arr[] = {2, 3, 3, 5, 3, 4, 1, 7, 7, 7, 7};
        int n = arr.length;
        System.out.println("Maximum repeating element is: " + maxRepeating(arr,n));
    }
}
