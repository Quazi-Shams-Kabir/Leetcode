//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;
import java.util.HashMap;

public class smallerthancurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
//        brute
        /*
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (num < nums[i]) {
                    ans[i]++;
                }
            }
        }
        return ans;
        */
//        better
        /*
        int n = nums.length;
        int[] copy = new int[n];

        for (int i = 0; i < n; i++)
            copy[i] = nums[i];

        Arrays.sort(copy);

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++)
            if (!hm.containsKey(copy[i]))   //store the index of the sorted array as value for the element as a key that indirectly says:
                // number of elements that are lesser than that element
                hm.put(copy[i], i);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++)
            ans[i] = hm.get(nums[i]);   //an ans array to store the values of hashmap in correct index of original array

        return ans;
         */
//        optimal
        int[] output = new int[nums.length];
        int[] count = new int[101]; // since the numbers are between 0 and 100
        for (int num : nums) {
            count[num]++;  //frequency array
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];   //counting the numbers which are smaller than the current
            // (as the freq array contains number of occurrences)
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];   // count of numbers
            // which are lesser than a current element,
            // minus one so that it doesn't count the element equal to itself
        }
        return output;
    }
}
