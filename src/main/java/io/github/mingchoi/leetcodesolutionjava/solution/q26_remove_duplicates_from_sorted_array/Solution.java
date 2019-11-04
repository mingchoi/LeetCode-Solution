package io.github.mingchoi.leetcodesolutionjava.solution.q26_remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != num) {
                num = nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
