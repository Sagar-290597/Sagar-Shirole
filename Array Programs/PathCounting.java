package Array;

public class PathCounting {
    public static int pathCounting(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for(int j = 0; j < n; j++) {
            arr[0][j] = 1;
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int p, q;
        p = 4;
        q = 4;
        System.out.println("The size of matrix is : " + p + ", " + q);
        System.out.println("The all possible paths from top left to bottom right is: " + pathCounting(p, q) + " ");
    }
}
