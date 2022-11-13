//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.*;

public class greatestnumofcandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3}; int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = max(candies);
            List<Boolean> ans = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else ans.add(false);

        }
        return ans;
    }
    static int max(int[] candies){
        int max=candies[0];
        for (int index : candies) {
            if (index > max) {
                max = index;
            }
        }
        return max;
    }
}
