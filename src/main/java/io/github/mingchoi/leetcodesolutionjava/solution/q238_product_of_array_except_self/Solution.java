package io.github.mingchoi.leetcodesolutionjava.solution.q238_product_of_array_except_self;
/*
Runtime: 2 ms, faster than 13.24% of Java online submissions for Product of Array Except Self.
Memory Usage: 42.5 MB, less than 53.54% of Java online submissions for Product of Array Except Self.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            left[i + 1] = left[i] * nums[i + 1];
            right[nums.length - i - 2] = right[nums.length - 1 - i] * nums[nums.length - i - 2];
        }
        nums[0] = right[1];
        for (int i = 1; i < nums.length - 1; i++) {
            nums[i] = left[i - 1] * right[i + 1];
        }
        nums[nums.length - 1] = left[nums.length - 2];
        return nums;
    }
}