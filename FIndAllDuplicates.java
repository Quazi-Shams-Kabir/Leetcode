//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FIndAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println((findDuplicates(nums)));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else i++;
        }
        List <Integer> ans = new ArrayList<>();
        for (int index = 0; index <nums.length ; index++) {
            if (nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
