//https://leetcode.com/problems/maximum-product-of-three-numbers/

public class MaxProductOfThreeNums {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    static int maximumProduct(int[] nums) {
        boolean isSwapped;
        //run the outer loop n-1 times
        for (int i = 0; i <nums.length ; i++) {
            isSwapped=false;
            // for each step the max item will come at the last respective index
            for (int j = 1; j < nums.length-i ; j++) {           //arr.length-1 will ensure it'll not run the loop for the sorted position
                //swap if the index element is smaller than the previous index element
                if (nums[j]<nums[j-1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    isSwapped=true;
                }
                //it'll ensure the loop will break if no swapping occur, which eventually mean the array is sorted
            }
            if (!isSwapped){
                break;
            }
        }
        // - * - * + = + ; - * - * - = - ;  Math.max will do this
        return Math.max(nums[0]*nums[1]*nums[nums.length-1 ], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
        //another method, O(n) complexity
/*
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

        for (int i = 0; i < nums
                .length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }

            if (nums[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min3 = min2;
                min2 = nums[i];
            } else if (nums[i] < min3) {
                min3 = nums[i];
            }
        }

        return Math.max(max1*max2*max3, max1*min1*min2);
*/
    }
}
