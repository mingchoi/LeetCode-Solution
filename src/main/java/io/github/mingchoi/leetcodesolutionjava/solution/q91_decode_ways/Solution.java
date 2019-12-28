package io.github.mingchoi.leetcodesolutionjava.solution.q91_decode_ways;

/*
Runtime: 1 ms, faster than 98.53% of Java online submissions for Decode Ways.
Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Decode Ways.
 */
class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (s.charAt(i - 1) != '0') dp[i] += dp[i - 1];
            if (i > 1 && (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) < '7'))) {
                dp[i] += dp[i - 2];
            }
        }
//        for (int n : dp) {
//            System.out.print(n + ", ");
//        }
//        System.out.println("\n");
        return dp[dp.length - 1];
    }
}
