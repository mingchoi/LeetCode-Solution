package io.github.mingchoi.leetcodesolutionjava.solution.q54_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int size = matrix.length * matrix[0].length;
        List<Integer> r = new ArrayList<>();
        int x = -1;
        int y = 0;
        int d = 0;

        while (r.size() < size) {
            int nx = x;
            int ny = y;

            // next cell
            if (d == 0) {
                nx = x + 1;
            } else if (d == 1) {
                ny = y + 1;
            } else if (d == 2) {
                nx = x - 1;
            } else if (d == 3) {
                ny = y - 1;
            }

            // check cell exist
            if (nx < 0 || nx >= matrix[0].length || ny < 0 || ny >= matrix.length) {
                d += 1;
                if (d > 3) {
                    d = 0;
                }
                continue;
            }
            if (matrix[ny][nx] == 0) {
                d += 1;
                if (d > 3) {
                    d = 0;
                }
                continue;
            }

            // add to list
            x = nx;
            y = ny;
            r.add(matrix[y][x]);
            matrix[y][x] = 0;
        }

        return r;
    }
}
