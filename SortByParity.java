//https://leetcode.com/problems/sort-array-by-parity/

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums={0,1,2};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int i = 0,j=0;
        while (j<nums.length){
            if (nums[j]%2==0){
                swap(nums,i++,j);
            }
            j++;
        }
        return nums;
    }
    static void swap(int[] arr, int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
