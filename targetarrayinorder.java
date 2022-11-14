//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.Arrays;
public class targetarrayinorder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        for (int i = 0,j=0; i < nums.length; i++) {
            if (ans[index[i]] ==-1){
                ans[index[i]]=nums[j++];
            }
            else ans = shiftandinsert(ans,index[i],nums[j++]);
        }
        return ans;
    }

    static int[] shiftandinsert(int[] nums, int index, int element) {
        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i-1];
        }
        nums[index] = element;
        return nums;
    }
}
//make a max method and assign the size of the array to max
//this will make sure nums[1], index [1] will return ans [0,1]  ...will do later