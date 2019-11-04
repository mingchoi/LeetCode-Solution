package io.github.mingchoi.leetcodesolutionjava.solution.q268_missing_number;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
Memory Usage: 38.8 MB, less than 100.00% of Java online submissions for Missing Number.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            a += i;
            b += nums[i];
        }
        return nums.length + a - b;
    }
}