package io.github.mingchoi.leetcodesolutionjava.solution.q239_sliding_window_maximum;

/*
Runtime: 34 ms, faster than 23.60% of Java online submissions for Sliding Window Maximum.
Memory Usage: 40.8 MB, less than 92.19% of Java online submissions for Sliding Window Maximum.
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[]{};
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                nums[j] = Math.max(nums[j], nums[j + 1]);
            }
        }
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i];
        }
        return result;
    }

    private void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.print("\n");
    }
}
