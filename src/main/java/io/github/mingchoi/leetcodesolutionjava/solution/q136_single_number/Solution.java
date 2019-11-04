package io.github.mingchoi.leetcodesolutionjava.solution.q136_single_number;

class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            r ^= nums[i];
        }
        return r;
    }
}
