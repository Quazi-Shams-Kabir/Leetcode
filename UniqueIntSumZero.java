//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

import java.util.*;

public class UniqueIntSumZero {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(Arrays.toString(sumZero(n)));

    }

    public static int[] sumZero(int n) {
//       super unoptimized, will revisit
        int[] ans = new int[n];
        Set<Integer> set = new HashSet<>();

        while (set.size() != n-1){
            int x = generateRandom(ans);
            set.add(x);
        }
        int i = 0;
        int maintainedSum = 0;
        for(int ele : set){
            ans[i] = ele;
            maintainedSum+=ans[i];
            i++;
        }
        ans[n - 1] = maintainedSum * -1;
        return ans;
    }

    static int generateRandom(int[] arr) {
        return (int) Math.floor(Math.random() * 1000000) + 1;
    }
}
