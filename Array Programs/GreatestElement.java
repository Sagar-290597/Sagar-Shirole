package assign.task.array;

public class GreatestElement {
        public static void findNxtLrgElem(int[] arr, int arrSize) {
            int nxtBgElem, j;
            for(int i = 0; i < arrSize; i++) {
                for(j = i + 1, nxtBgElem = -1; j < arrSize; j++) {
                    if(arr[i] < arr[j]) {
                        nxtBgElem = arr[j];
                        break;
                    }
                }
                System.out.println("Next bigger element of " + arr[i] + " in the array is:   " + nxtBgElem);
            }
        }

        public static void formBigElemArray(int[] arr, int arrSize) {
            int nxtBgElem, j;
            for (int i = 0; i < arrSize; i++) {
                for (j = i + 1, nxtBgElem = -1; j < arrSize; j++) {
                    if (arr[i] < arr[j]) {
                        nxtBgElem = arr[j];
                        break;
                    }
                }
                System.out.print(nxtBgElem + " ");
            }
        }
                public static void main (String[]args){
                    int[] arr = {5, 3, 10, 9, 6, 13};
                    int size = arr.length;
                    System.out.print("The given array is :  ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + "  ");
                    }
                    System.out.println();
                    System.out.println("Next Bigger Elements are:" );
                    findNxtLrgElem(arr, size);

                    System.out.println("Next Bigger Elements are:");
                    formBigElemArray(arr, size);
                }
            }