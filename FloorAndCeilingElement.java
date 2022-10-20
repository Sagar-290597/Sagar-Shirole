package Array2;

public class FloorAndCeilingElement {
    public static int findCeil(int[] arr, int n, int x) {
            int low = 0, high = n - 1, mid;
            int ceil = -1;
            while(low <= high) {
                mid = (low + high) / 2;
                if(arr[mid] == x) {
                    return arr[mid];
                } else if(x < arr[mid]) {
                    ceil = arr[mid];
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ceil;
        }

        public static int findFloor(int[] arr, int n, int x) {
            int low = 0, high = n - 1, mid;
            int floor = -1;
            while(low <= high) {
                mid = (low + high) / 2;
                if(arr[mid] == x) {
                    return arr[mid];
                } else if(x < arr[mid]) {
                    high = mid - 1;
                } else {
                    floor = arr[mid];
                    low = mid + 1;
                }
            }
            return floor;
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 8, 9};
            int ctr = arr.length;
            System.out.print("The given array is :  ");
            for(int i = 0; i < ctr; i++) {
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
            for (int i = 0; i <= 10; i++)
            {
                System.out.print("Number: " +i +" ");
                System.out.print("ceiling is: " +findCeil(arr, ctr, i) +" ");
                System.out.print("floor is: " +findFloor(arr, ctr, i) +" \n");
            }
        }
    }
