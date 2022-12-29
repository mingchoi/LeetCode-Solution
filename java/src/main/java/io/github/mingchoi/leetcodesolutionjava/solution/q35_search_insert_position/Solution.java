package io.github.mingchoi.leetcodesolutionjava.solution.q35_search_insert_position;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 39 MB, less than 100.00% of Java online submissions for Search Insert Position.
 */

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (target <= nums[i]) return i;
            i++;
        }
        return i;
    }
}