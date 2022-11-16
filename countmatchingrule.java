//https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countmatchingrule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<String>(Arrays.asList("phone", "blue", "pixel")));
        items.add(new ArrayList<String>(Arrays.asList("computer", "silver", "lenovo")));
        items.add(new ArrayList<String>(Arrays.asList("phone", "gold", "iphone")));
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
//        System.out.println(items.get(2).get(2));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        //which key to search
        int key=-1;
        if (ruleKey.equals("type")) {
            key=0;
        }
        if (ruleKey.equals("color")) {
            key=1;
        }
        if (ruleKey.equals("name")) {
            key=2;
        }

        for (List<String> item : items) {
            if (item.get(key).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
