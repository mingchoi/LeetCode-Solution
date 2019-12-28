package io.github.mingchoi.leetcodesolutionjava.solution.q1252_cells_with_odd_values_in_a_matrix;
/*
Runtime: 1 ms, faster than 90.64% of Java online submissions for Cells with Odd Values in a Matrix.
Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Cells with Odd Values in a Matrix.
 */
public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] cells = new int[n][m];
        for (int[] pair : indices) {
            for (int i = 0; i < m; i++) {
                cells[pair[0]][i] += 1;
            }
            for (int i = 0; i < n; i++) {
                cells[i][pair[1]] += 1;
            }
        }
        int count = 0;
        for (int[] r : cells) {
            for (int c : r) {
                if (c % 2 == 1) count++;
            }
        }
        return count;
    }
}