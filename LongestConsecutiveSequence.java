//https://leetcode.com/problems/longest-consecutive-sequence/


import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,101,4,3,102,1,2};
        System.out.println(longestSuccessiveElements(arr));
    }

    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0) {
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for (int j : a) {
            set.add(j);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                int count = 1;
                int x = it;

                while (set.contains(x + 1)) {
                    x += 1;
                    count += 1;

                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
