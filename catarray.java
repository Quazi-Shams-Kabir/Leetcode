//https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class catarray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
//        for (int i=0;i< nums.length*2;i++){
//            if (i< nums.length) {
//            ans[i]=nums[i];
//            }
//            else
//                ans[i] = nums[i- nums.length];
//        }

//        or
        for(int i = 0; i < nums.length; i++){           //ofc faster coz loop is running half the time than before
            ans[i] = ans[i + nums.length] = nums[i];    //set the 2 values together
        }

//        or
//        int[] ans = new int[nums.length<<1];
//        System.arraycopy(nums, 0, ans, 0, nums.length);
//        System.arraycopy(nums, 0, ans, nums.length, nums.length);     //will check later
        return ans;
    }
}
