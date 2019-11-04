package io.github.mingchoi.leetcodesolutionjava.solution.q198_house_robber;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for House Robber.
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] best = new int[nums.length];
        best[0] = nums[0];
        best[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            best[i] = Math.max(best[i - 2] + nums[i], best[i - 1]);
        }

        return best[nums.length - 1];
    }
}
