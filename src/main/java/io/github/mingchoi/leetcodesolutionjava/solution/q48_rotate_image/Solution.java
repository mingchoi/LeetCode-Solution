package io.github.mingchoi.leetcodesolutionjava.solution.q48_rotate_image;

import java.util.ArrayList;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Rotate Image.
 */
class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                arr.add(matrix[y][x]);
            }
        }
        for (int y = 0; y < matrix.length; y++) {
            for (int x = matrix.length - 1; x >= 0; x--) {
                matrix[y][x] = arr.remove(0);
            }
        }
    }
}
