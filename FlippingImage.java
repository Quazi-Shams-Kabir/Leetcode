//https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for (int[] a : (flipAndInvertImage(image))) {
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
/*
        int[][] ans = new int[n][n];
        //flip
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                ans[i][j]=image[i][(n-1)-j];
            }
        }


        invert
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }
                else ans[i][j]=0;
            }
        }
 */

//        or
//        flip but inner loop will run for n/2 times, coz we are swapping not initializing like before
        /*
        int temp;
        for (int i = 0; i < n; i++) {
            //directly flip and invert 1 and 0
            for (int j = 0; j < (n + 1) / 2; j++) {
                temp = image[i][j];
                image[i][j] = 1 - image[i][(n - 1) - j];
                image[i][(n - 1) - j] = 1 - temp;
            }
        }
         */

        //or,
        //using bitwise operator
        int temp;
        for (int[] row : image) {
            //directly flip and invert 1 and 0
            for (int j = 0; j < (n + 1) / 2; j++) {
                temp = row[j]^1;
                row[j] =row[n-j-1]^1;
                row[n-j-1]= temp;
            }
        }
            return image;
    }
}
