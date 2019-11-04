package io.github.mingchoi.leetcodesolutionjava.solution.q55_jump_game;

class Solution {
    public boolean canJump(int[] nums) {
        int a = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= a - i) {
                a = i;
            }
        }
        return a == 0;
    }
}
