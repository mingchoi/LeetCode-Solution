package io.github.mingchoi.leetcodesolutionjava.solution.q300_longest_increasing_subsequence;

/*
Runtime: 8 ms, faster than 64.56% of Java online submissions for Longest Increasing Subsequence.
Memory Usage: 36.9 MB, less than 54.00% of Java online submissions for Longest Increasing Subsequence.
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            dp[i] = 1;
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] < nums[j]) {
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
                j++;
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}