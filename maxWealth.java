//https://leetcode.com/problems/richest-customer-wealth/submissions/
public class maxWealth {
    public static void main(String[] args) {
        int[][] arr= {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        int sum;
//        for (int person = 0; person < accounts.length; person++) {
//            sum=0;
//            for (int money = 0; money < accounts[person].length; money++) {
//                    sum = sum + accounts[person][money];
//            }
//            if (sum>ans){
//                ans = sum;
//            }
//        }

        //or
        for (int[] i : accounts) {
            sum=0;
            for(int j: i){
                sum = sum + j;
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
