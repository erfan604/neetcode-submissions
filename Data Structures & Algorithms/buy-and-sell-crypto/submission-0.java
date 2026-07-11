class Solution {
    public int maxProfit(int[] prices) {
        int ptr1 = 0;
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            int total = prices[i] - prices[ptr1];
            if (total > profit) {
                profit = total;
            }
            if (prices[i] < prices[ptr1]){
                ptr1 = i;
            }
        }
        return profit;
    }
}
