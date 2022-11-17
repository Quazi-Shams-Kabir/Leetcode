//https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class flippingimage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for(int[] a:(flipAndInvertImage(image))){
            System.out.println(Arrays.toString(a));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int n= image.length;
        int[][] ans = new int[n][n];
        //flip
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                ans[i][j]=image[i][(n-1)-j];
            }
        }
        //invert
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }
                else ans[i][j]=0;
            }
        }

        return ans;
    }
}
