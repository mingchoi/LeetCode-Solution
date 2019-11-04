package io.github.mingchoi.leetcodesolutionjava.solution.q283_move_zeroes;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 37.9 MB, less than 95.80% of Java online submissions for Move Zeroes.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int pt = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[pt] = nums[i];
            if (nums[i] != 0) {
                pt += 1;
            }
        }
        for (int i = pt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}