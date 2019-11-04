package io.github.mingchoi.leetcodesolutionjava.solution.q213_house_robber_ii;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length < 4) {
            int max = 0;
            for (int i : nums) {
                max = Math.max(max, i);
            }
            return max;
        }

        // TODO: not working

        int lastMax = 0;
        int currMax = 0;
        int len = nums.length * 2;
        for (int i = 0; i < len; i++) {
            int r = Math.max(lastMax + nums[i], currMax);
            lastMax = currMax;
            currMax = r;
        }
        return currMax;
    }
}