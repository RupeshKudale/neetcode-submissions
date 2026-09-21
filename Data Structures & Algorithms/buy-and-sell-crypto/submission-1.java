class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 0;
        int maxProfit = 0;

        while(sell < prices.length) {
            int profit = prices[sell] - prices[buy];
            maxProfit = Math.max(maxProfit, profit);

            if(profit < 0) {
                buy = sell;
            }
            sell++;
        }

        return maxProfit;
    }
}
