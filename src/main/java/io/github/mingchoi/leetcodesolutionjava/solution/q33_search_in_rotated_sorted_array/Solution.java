package io.github.mingchoi.leetcodesolutionjava.solution.q33_search_in_rotated_sorted_array;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
Memory Usage: 40.2 MB, less than 11.95% of Java online submissions for Search in Rotated Sorted Array.
 */
class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (target < nums[0]) {
            for (int i = nums.length - 1; i > -1; i--) {
                if (nums[i] == target) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}
