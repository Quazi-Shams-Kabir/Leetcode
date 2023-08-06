//https://leetcode.com/problems/set-matrix-zeroes/


public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 1}};
        System.out.println(arr[0].length);
    }

    public void setZeroes(int[][] matrix) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else col0 = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
