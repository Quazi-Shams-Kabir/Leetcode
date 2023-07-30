//https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i =0 ; i<nums.length; i++){
            ans^=nums[i];
        }
        return ans;
    }
}
