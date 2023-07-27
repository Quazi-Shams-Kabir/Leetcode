//https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
//        int[] arr = {-1,-100,3,99};
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = {-1};
        int k = 2;
//        rotate(arr, k);
        rotateOptimal(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        /*to make sure it doesn't do unnecessary rotations, cuz if k = nums.length then array will be same after rotation*/
        int length = nums.length;
        k %= length;
        int[] temp = new int[k];
        for (int i = length-1, j = k-1; i >=length-k; i--,j--) {
            temp[j] = nums[i];
        }

        for (int i = length-(k+1),j = length-1; i >= 0; i--,j--) {
            nums[j] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

    /* Space Optimized */
    public static void rotateOptimal(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums,length-k, length-1);
        reverse(nums,0, length-k-1);
        reverse(nums,0, length-1);
    }
    public static void reverse(int[] arr, int start ,int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
