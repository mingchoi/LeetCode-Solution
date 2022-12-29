package io.github.mingchoi.leetcodesolutionjava.solution.q26_remove_duplicates_from_sorted_array;
/*
Runtime: 1 ms, faster than 97.79% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 41.1 MB, less than 27.13% of Java online submissions for Remove Duplicates from Sorted Array.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
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
