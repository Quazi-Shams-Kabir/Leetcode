//https://leetcode.com/problems/sort-array-by-parity-ii

import java.util.Arrays;

public class SortByParity2 {
    public static void main(String[] args) {
        int[] nums = {1,2,8,6,7,9};
        System.out.print(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        /*
        //Time complexity more but Space complexity O(1)
        for (int i = 0; i <nums.length; i+=2) {
            int j=1;
            if (nums[i]%2!=0){
                while (nums[j]%2==1){
                    j+=2;
                }
                swap(nums,i,j);
            }
        }
         */
        //Time complexity O(1) Space complexity O(n)
        int even=0;
        int odd=1;
        int[] ans = new int[nums.length];
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[even] = num;
                even += 2;
            } else {
                ans[odd] = num;
                odd += 2;
            }
        }
        return ans;
    }
    static void swap (int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
