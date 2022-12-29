package io.github.mingchoi.leetcodesolutionjava.solution.q1051_height_checker;

import java.util.Arrays;

/*
Runtime: 1 ms, faster than 87.78% of Java online submissions for Height Checker.
Memory Usage: 34.7 MB, less than 100.00% of Java online submissions for Height Checker.
 */
public class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sorted[i] != heights[i]) sum++;
        }
        return sum;
    }
}