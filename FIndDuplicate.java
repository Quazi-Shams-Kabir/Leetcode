//https://leetcode.com/problems/find-the-duplicate-number/

public class FIndDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i=0;
        while (i< nums.length){
            //checks whether the element is at correct index, if not swap else move to next element
            if (nums[i]!= i+1) {
                int correct=nums[i]-1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else return nums[i];
            }
            else i++;
        }
        return -1;
    }
    static void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
