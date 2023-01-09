//https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        //will solve this again later
        Arrays.sort(nums);
        for (int index = 1; index <nums.length ; index++) {
            if (nums[index]==nums[index-1]){
                return true;
            }
        }
        return false;
    }
}
