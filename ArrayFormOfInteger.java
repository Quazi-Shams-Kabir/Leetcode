//https://leetcode.com/problems/add-to-array-form-of-integer/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {6};
        int k = 809;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = num.length;
        for (int i = n - 1; i >= 0; i--) {
            int element = num[i] + k;
            ans.add( element % 10);
            k = element / 10;
        }
        if (k != 0) {
            while (k != 0) {
                ans.add(k%10);
                k/=10;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
