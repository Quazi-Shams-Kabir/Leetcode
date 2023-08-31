//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

public class CanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] ans = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(findRotation(arr,ans));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] temp = new int[n][n];
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[j][n - i - 1] = mat[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                System.arraycopy(temp[i], 0, mat[i], 0, n);
            }
            if (ifMatch(temp, target)) {
                return true;
            }
        }
        return false;
    }
    static boolean ifMatch(int[][] arr, int[][] temp) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (temp[i][j] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
// TODO: optimize it later
