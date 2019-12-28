package io.github.mingchoi.leetcodesolutionjava.solution.q200_number_of_islands;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Islands.
Memory Usage: 40.7 MB, less than 98.60% of Java online submissions for Number of Islands.
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    removeIsland(grid, r, c);
                }
            }
        }
        return count;
    }

    public void removeIsland(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) return;
        if (grid[r][c] == '0') return;
        grid[r][c] = '0';
        removeIsland(grid, r - 1, c);
        removeIsland(grid, r + 1, c);
        removeIsland(grid, r, c - 1);
        removeIsland(grid, r, c + 1);
    }
}