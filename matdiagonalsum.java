//https://leetcode.com/problems/matrix-diagonal-sum/

public class matdiagonalsum {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,1,1}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;

        for (int i = 0; i < n; i++) {
            sum+=mat[i][i]+mat[i][(n-1)-i];
        }

        //to check the mat.len is even or odd, if odd sub the mid ele
        if (n%2!=0){
        return sum-mat[n/2][n/2];
        }
        else {
        return sum;
        }
    }
}
