package io.github.mingchoi.leetcodesolutionjava.solution.q189_rotate_array;
/*
Runtime: 1 ms, faster than 52.39% of Java online submissions for Rotate Array.
Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Rotate Array.
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int target = Math.floorMod(i - k, nums.length);
            tmp[i] = nums[target];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
    }
}
