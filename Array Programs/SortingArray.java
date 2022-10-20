package assign.task.array;

import java.util.Arrays;

public class SortingArray {
        public static void main(String[] args) {
            int array[]={4, 14, 8, 0, 2, 5, 2, 1, 0, 17, 9, 0, 5};

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