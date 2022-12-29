package io.github.mingchoi.leetcodesolutionjava.solution.q334_increasing_triplet_subsequence;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Triplet Subsequence.
Memory Usage: 38.6 MB, less than 95.35% of Java online submissions for Increasing Triplet Subsequence.
 */
public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
}