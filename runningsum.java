import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        int sum=0;
        int[] ans=new int[nums.length];
        for (int i=0;i< nums.length;i++){
            ans[i]=sum+=nums[i];
        }
        //or
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] += nums[i - 1];
//        }
//        return nums;
        return ans;
    }
}
