//https://leetcode.com/problems/next-permutation/

import java.util.Arrays;

public class NextGreaterPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
//        int[] arr = {3,2,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, n-1);
            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index + 1, n-1);
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
