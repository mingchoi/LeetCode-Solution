package io.github.mingchoi.leetcodesolutionjava.solution.q55_jump_game;
/*
Runtime: 1 ms, faster than 99.09% of Java online submissions for Jump Game.
Memory Usage: 40.8 MB, less than 52.14% of Java online submissions for Jump Game.
 */
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
