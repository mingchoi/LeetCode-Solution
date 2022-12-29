package io.github.mingchoi.leetcodesolutionjava.solution.q136_single_number;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
Memory Usage: 39.2 MB, less than 97.04% of Java online submissions for Single Number.
 */
class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            r ^= nums[i];
        }
        return r;
    }
}
