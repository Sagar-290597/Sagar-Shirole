package Array;

import java.util.Arrays;

public class Sorting
{
    public static void main(String[] args) {
        int array[]={37, 62, 52, 7, 48, 3, 15, 61};

        System.out.println("The Given Array Is:" + Arrays.toString(array));
        for (int i=0;i< array.length;i++)
        {
            for (int j=i+1;j< array.length;j++)
            {
                if(array[i] > array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }
            }
        }
        System.out.print("Sorted Array Is: ");
        for (int i=0;i< array.length;i++)
        {
            System.out.print(array[i] +" ");
        }
    }
}
