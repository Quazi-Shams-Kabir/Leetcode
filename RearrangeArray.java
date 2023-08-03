//https://leetcode.com/problems/rearrange-array-elements-by-sign

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {3,-1,2,5,-3,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i<n ; i++){
            if(nums[i]<0){
                ans[negIndex] = nums[i];
                negIndex+=2;
            }
            else {
                ans[posIndex] = nums[i];
                posIndex+=2;
            }
        }
        return ans;
    }
}
