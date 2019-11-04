package io.github.mingchoi.leetcodesolutionjava.solution.q48_rotate_image;

import java.util.ArrayList;

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
