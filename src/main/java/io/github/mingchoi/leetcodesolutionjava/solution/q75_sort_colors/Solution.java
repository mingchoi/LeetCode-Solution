package io.github.mingchoi.leetcodesolutionjava.solution.q75_sort_colors;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
Memory Usage: 35.3 MB, less than 99.21% of Java online submissions for Sort Colors.
 */
class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c0++;
            } else if (nums[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        for (int i = 0; i < c0; i++) {
            nums[i] = 0;
        }
        for (int i = c0; i < c0 + c1; i++) {
            nums[i] = 1;
        }
        for (int i = c0 + c1; i < c0 + c1 + c2; i++) {
            nums[i] = 2;
        }
    }
}
