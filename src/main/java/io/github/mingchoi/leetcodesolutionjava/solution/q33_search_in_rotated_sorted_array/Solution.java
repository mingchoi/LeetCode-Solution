package io.github.mingchoi.leetcodesolutionjava.solution.q33_search_in_rotated_sorted_array;

class Solution {
    public int search(int[] nums, int target) {
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
