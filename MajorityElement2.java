//https://leetcode.com/problems/majority-element-ii/

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] v) {

        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;

        for (int i : v) {
            if (count1 == 0 && i != element2) {
                count1 = 1;
                element1 = i;
            } else if (count2 == 0 && i != element1) {
                count2 = 1;
                element2 = i;
            } else if (i == element1) {
                count1++;
            } else if (i == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int j : v) {
            if (j == element1) count1++;
            if (j == element2) count2++;
        }

        int majorityElement = (v.length / 3) + 1;
        /*all the elements in might be same and that the single majority element, this check prevent from creating 2 element ans list if that happen, as the ans will be of 1 element only*/
        if (element1 != element2) {
            if (count1 >= majorityElement) ans.add(element1);
            if (count2 >= majorityElement) ans.add(element2);
        } else ans.add(element1);

        /*sort accordingly if asked*/

        return ans;
    }
}
