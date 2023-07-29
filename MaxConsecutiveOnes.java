//https://leetcode.com/problems/max-consecutive-ones/


public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else count = 0;
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
