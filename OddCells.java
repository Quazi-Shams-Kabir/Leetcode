//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class OddCells {
    public static void main(String[] args) {
        int[][] indices = {{1, 1}, {0, 0}};
        System.out.println(oddCells(2,2,indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            for (int j = 0; j < 2; j++) {
                increment(matrix, j, index[j]);
            }
        }
        int count = 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (matrix[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void increment(int[][] mat, int what, int which) {
        //row
        if (what == 0) {
            for (int i = 0, m = mat[which].length; i < m; i++) {
                mat[which][i]++;
            }
        }
        //col
        else {
            for (int i = 0, n = mat.length; i < n; i++) {
                mat[i][which]++;
            }
        }
    }
}
