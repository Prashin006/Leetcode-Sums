class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices){
            minPrice = Math.min(minPrice, price);
            max_profit = Math.max(max_profit, price - minPrice);
        }
        return max_profit;
    }
}