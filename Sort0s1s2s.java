//https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0,high = nums.length-1;
        while (mid<=high){
            if (nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if (nums[mid]==1){
                mid++;
            }
            else {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
