//https://leetcode.com/problems/missing-number/
//Amazon
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    static public int missingNumber(int[] nums) {
        int i=0;
        //first we will sort the array
        while (i<nums.length){
            int correct=nums[i];
            if (nums[i]<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        //Case 1
        //then we will find the missing index
        for (int index = 0; index <nums.length ; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        //Case 2
        //if the missing number is not in the array but the array contains all the other elements of its index
        //{0,1,2,3} but n is 4, missing element = {4} which is n itself
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
