//https://leetcode.com/problems/best-time-to-buy-and-sell-stock

public class BuySellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,3,5,4,2,6};
        System.out.println(bestTimeToBuyAndSellStock(arr));
    }
    public static int bestTimeToBuyAndSellStock(int []prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - min;
            profit = Math.max(cost,profit);
            min = Math.min(prices[i], min);
        }
        return profit;
    }
}