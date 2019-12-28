package io.github.mingchoi.leetcodesolutionjava.solution.q322_coin_change;

/*
Runtime: 9 ms, faster than 84.99% of Java online submissions for Coin Change.
Memory Usage: 36 MB, less than 94.67% of Java online submissions for Coin Change.
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0 || coins.length == 0) return 0;

        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int curr = 1; curr <= amount; curr++) {
            dp[curr] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int target = curr - coins[j];
                if (target >= 0) {
                    if (dp[target] != Integer.MAX_VALUE) {
                        dp[curr] = Math.min(dp[curr], dp[target] + 1);
                    }
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
