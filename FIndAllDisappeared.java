//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Google

import java.util.ArrayList;
import java.util.List;

public class FIndAllDisappeared {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        //first we will sort the array
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        List<Integer> ans = new ArrayList<>();
        //search the missing elements and add it to list
        for (int index = 0; index <nums.length ; index++) {
            if (nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}