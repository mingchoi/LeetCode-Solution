package io.github.mingchoi.leetcodesolutionjava.solution.q883_projection_area_of_3d_shapes;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Projection Area of 3D Shapes.
Memory Usage: 42.5 MB, less than 57.14% of Java online submissions for Projection Area of 3D Shapes.
 */
public class Solution {
    public int projectionArea(int[][] grid) {
        int sum = 0;
        int rmax = 0;
        int cmax = 0;
        for (int r = 0; r < grid.length; r++) {
            rmax = cmax = 0;
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] != 0) sum += 1;
                rmax = Math.max(rmax, grid[r][c]);
                cmax = Math.max(cmax, grid[c][r]);
            }
            sum += rmax + cmax;
        }
        return sum;
    }
}