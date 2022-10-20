package Array;

public class MaximumSpan
{
    public static int maxSpan(int[] arr1, int n) {
        if(n > 0) {
            int maxSpanCtr = 1;
            for(int i = 0; i < n; i++)
            {
                for(int j = n - 1; j > i; j--)
                {
                    if(arr1[j] == arr1[i])
                    {
                        int count = (j - i) + 1;
                        if(count > maxSpanCtr)
                        {
                            maxSpanCtr = count;
                        }
                        break;
                    }
                }
            }
            return maxSpanCtr;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {17, 42, 19, 7, 27, 24, 17, 54, 73};
        int arrSize =arr1.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("The span between the same values in the array is:  " + maxSpan(arr1, arrSize));
    }
}
