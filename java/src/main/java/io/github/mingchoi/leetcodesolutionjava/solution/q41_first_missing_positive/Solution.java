package io.github.mingchoi.leetcodesolutionjava.solution.q41_first_missing_positive;

import java.util.HashMap;

/*
Runtime: 1 ms, faster than 37.60% of Java online submissions for First Missing Positive.
Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for First Missing Positive.
 */
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }
        for (int j = 1; j < nums.length + 1; j++) {
            if (!map.containsKey(j)) {
                return j;
            }
        }
        return nums.length + 1;
    }
}
