package io.github.mingchoi.leetcodesolutionjava.solution.q34_find_first_and_last_position_of_element_in_sorted_array;
/*
Runtime: 1 ms, faster than 14.89% of Java online submissions for Find First and Last Position of Element in Sorted Array.
Memory Usage: 43.7 MB, less than 97.16% of Java online submissions for Find First and Last Position of Element in Sorted Array.
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                last = i;
                if (first == -1) {
                    first = last;
                }
            }
        }
        return new int[]{first, last};
    }
}
