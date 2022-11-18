//https://leetcode.com/problems/transpose-matrix/

import java.util.Arrays;

public class transposemat {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        for(int[] a:(transpose(matrix))){
            System.out.println(Arrays.toString(a));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
