//https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] Matrix = {{1,3,5,7},{10,11,16,20},{23, 30, 34, 60}};
        System.out.println(spiralOrder(Matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int left = 0, top = 0, right = m - 1, bottom = n - 1;

        while (top<=bottom && left<=right) {

            for (int i = left; i <=right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            /* Check for, if the Array have only single row */
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            /* Check for the innermost spiral where there is not top */
            if(left<=right){
                for (int i = bottom; i >=top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
