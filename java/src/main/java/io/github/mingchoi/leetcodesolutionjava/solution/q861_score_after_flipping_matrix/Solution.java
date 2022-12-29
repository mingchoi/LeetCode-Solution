package io.github.mingchoi.leetcodesolutionjava.solution.q861_score_after_flipping_matrix;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Score After Flipping Matrix.
Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Score After Flipping Matrix.
 */
public class Solution {
    public int matrixScore(int[][] A) {
        if (A.length == 0) return 0;
        if (A[0].length == 0) return 0;

        // check row toggle
        for (int r = 0; r < A.length; r++) {
            if (A[r][0] == 0) {
                for (int c = 0; c < A[0].length; c++) {
                    A[r][c] = A[r][c] == 0 ? 1 : 0;
                }
            }
        }

        // check column toggle
        int sum = 0;
        for (int c = 0; c < A[0].length; c++) {
            int zero = 0;
            int one = 0;
            for (int r = 0; r < A.length; r++) {
                if (A[r][c] == 0) zero++;
                else one++;
            }
            sum += Math.max(zero, one) * Math.pow(2, A[0].length - c - 1);
        }

        return sum;
    }
}