//https://leetcode.com/problems/maximum-subarray/

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int sum = 0;
        int max = arr[0];
        for (int j : arr) {
            sum += j;
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
