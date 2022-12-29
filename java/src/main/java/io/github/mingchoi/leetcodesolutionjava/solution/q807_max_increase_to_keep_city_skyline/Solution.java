package io.github.mingchoi.leetcodesolutionjava.solution.q807_max_increase_to_keep_city_skyline;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Increase to Keep City Skyline.
Memory Usage: 43.9 MB, less than 40.74% of Java online submissions for Max Increase to Keep City Skyline.
 */

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid.length == 0) return 0;
        if (grid[0].length == 0) return 0;
        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                rows[r] = Math.max(rows[r], grid[r][c]);
                cols[c] = Math.max(cols[c], grid[r][c]);
            }
        }
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                count += Math.min(rows[r], cols[c]) - grid[r][c];
            }
        }
        return count;
    }
}