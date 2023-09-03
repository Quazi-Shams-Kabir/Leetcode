import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1,10, 4, 2},
//                          {9, 3, 8, 7},
//                         {15,16,17,12}};
//        int[][] matrix = {{3,6},
//                          {7,1},
//                          {5,2},
//                          {4,8}};
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(isLucky(matrix,i,j)){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }

    static boolean isLucky(int[][] matrix, int row, int col) {
        int element = matrix[row][col];
        for (int j = 0; j <matrix[row].length ; j++) {
            if (matrix[row][j]<element && j != col){
                return false;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            if (matrix[i][col] > element && i != row)
                return false;
        }
        return true;
    }
}
