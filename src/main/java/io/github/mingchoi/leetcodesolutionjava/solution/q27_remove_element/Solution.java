package io.github.mingchoi.leetcodesolutionjava.solution.q27_remove_element;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Remove Element.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int wpt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[wpt] = nums[i];
                wpt++;
            }
        }
        return wpt;
    }
}