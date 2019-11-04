package io.github.mingchoi.leetcodesolutionjava.solution.q189_rotate_array;

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
