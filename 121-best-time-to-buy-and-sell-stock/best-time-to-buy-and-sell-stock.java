class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];
        int maxProfit = 0;
        //   5-1=4
        //   3-1=2
        //   6-1=5
        //   4

        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;

    }
}
