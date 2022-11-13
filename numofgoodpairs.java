//https://leetcode.com/problems/number-of-good-pairs/

public class numofgoodpairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int ans=0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]==nums[j]){
//                    ans++;
//                }
//            }
//        }

//        or
        int[] count = new int[102];
        for(int i: nums){
             count[i]++;
        }
        for(int i: count){
           ans += ((i) * (i-1))/2;
        }
        return ans;
    }
}
