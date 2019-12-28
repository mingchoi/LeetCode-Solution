package io.github.mingchoi.leetcodesolutionjava.solution.q121_best_time_to_buy_and_sell_stock;

/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Not 7-1 = 6, as selling price needs to be larger than buying price.

Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
*/

/*
Runtime: 1 ms, faster than 79.37% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 37 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
 */
class Solution {
    public int maxProfit_straight(int[] prices) {
        if (prices.length == 0) return 0;
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = prices[i];
            }
            if (prices[i] > max) {
                max = prices[i];
            }
            profit = Math.max(profit, max - min);
        }
        return profit;
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int profit = 0;
        int dayMax = 0;
        for (int i = 1; i < prices.length; i++) {
            dayMax = Math.max(0, dayMax) + prices[i] - prices[i - 1];
            if(dayMax > profit) profit = dayMax;
        }
        return profit;
    }
}
