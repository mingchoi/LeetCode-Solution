package io.github.mingchoi.leetcodesolutionjava.solution.q73_set_matrix_zeroes;

import java.util.HashMap;
/*
Runtime: 3 ms, faster than 17.29% of Java online submissions for Set Matrix Zeroes.
Memory Usage: 49.8 MB, less than 7.14% of Java online submissions for Set Matrix Zeroes.
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        HashMap<Integer, Boolean> mapx = new HashMap<>();
        HashMap<Integer, Boolean> mapy = new HashMap<>();

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                if (matrix[y][x] == 0) {
                    mapx.put(x, true);
                    mapy.put(y, true);
                }
            }
        }

        for (int y = 0; y < matrix.length; y++) {
            if (mapy.containsKey(y)) {
                for (int x = 0; x < matrix[0].length; x++) {
                    matrix[y][x] = 0;
                }
            } else {
                for (int x = 0; x < matrix[0].length; x++) {
                    if (mapx.containsKey(x)) {
                        matrix[y][x] = 0;
                    }
                }
            }
        }
    }
}
