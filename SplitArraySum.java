//https://leetcode.com/problems/split-array-largest-sum/

public class SplitArraySum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        //get the max and minimum sum by splitting array
        //max sum = sum of all the elements in the array where split(here k) == 1
        //min sum = the largest element of the array where split(k)== n (nums.length)
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        //binary search in the min and max to get ans quickest
        while (start<end){

            //taking mid as the potential ans
            int mid = start+(end-start)/2;

            //counting the no. of pieces we can divide it in with max sum
            int sum=0;
            int piece=1;
            for (int num:nums){
                //this check will not let split the array which's sum is more than mid
                if (sum+num>mid){
                    sum=num;
                    //this will count the no. of piece it get divided into
                    piece++;
                }
                else {
                    sum+=num;
                }
            }
            //this will make sure no. of pieces don't exceed k
            if (piece>k){
                //k is fixed we can only change the sum
                //if pieces is more == less sum, more pieces == less element in a subset == less max sum
                //so we need increase the sum
                //to increase the sum we need to go right (normal bs)
                start=mid+1;
            }
            //if pieces is less == high sum, less pieces == more element in a subset == high max sum
            //so we need decrease the sum
            //to decrease the sum we need to go left (normal bs)
            else {
                end=mid;
            }
        }
        //the solution is the only remaining element in the bs, so it'll be all three start, end and mid
        return end;
    }
}
