//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class shufflearray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[n*2];

        for (int i = 0,j=0; i < n; i++,j=j+2) {
            ans[j]=nums[i];
        }
        for (int i = n,j=1; i <2*n ; i++,j=j+2) {
            ans[j]=nums[i];
        }
//or
//        for (int i = 0; i < n; i++) {
//            ans[2 * i] = nums[i];
//            ans[2 * i + 1] = nums[n + i];
//        }
        return ans;
    }
}
