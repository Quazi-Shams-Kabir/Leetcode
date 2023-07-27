//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
