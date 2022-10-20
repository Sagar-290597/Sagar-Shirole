package assign.task.array;

import java.util.Arrays;

public class TriangleForm {
        public static int countNumberOfTriangles(int[] arr1, int arrSize) {
            int ctrTriangle = 0, k;
            Integer[] arr1Boxed = new Integer[arrSize];
            for(int i = 0; i < arr1Boxed.length; i++) arr1Boxed[i] = arr1[i];
            Arrays.sort(arr1Boxed, (one, two) -> (one > two ? 1 : 0));
            for(int i = 0; i < arr1Boxed.length; i++) arr1[i] = arr1Boxed[i];

            for(int i = 0; i < arrSize - 2; ++i) {
                for(int j = i + 1; j < arrSize; ++j) {
                    k = j + 1;
                    while(k < arrSize && arr1[i] + arr1[j] > arr1[k]) {
                        k++;
                    }
                    ctrTriangle += k - j - 1;
                }
            }
            return ctrTriangle;
        }

        public static void main(String[] args) {
            int[] arr1 = {6, 18, 9, 7, 10};
            int n = arr1.length;
            System.out.print("The given array is :  ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr1[i] + "  ");
            }
            System.out.println();
            System.out.println("Number of possible triangles can be formed from the array is: " + countNumberOfTriangles(arr1, n));
        }
    }
