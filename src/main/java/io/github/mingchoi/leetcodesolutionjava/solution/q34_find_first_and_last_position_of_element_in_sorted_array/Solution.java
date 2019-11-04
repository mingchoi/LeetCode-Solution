package io.github.mingchoi.leetcodesolutionjava.solution.q34_find_first_and_last_position_of_element_in_sorted_array;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = last;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}
