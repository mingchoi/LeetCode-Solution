package io.github.mingchoi.leetcodesolutionjava.solution.q832_flipping_an_image;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Flipping an Image.
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int colLen = A[0].length;
        int colLenHalf = A[0].length >> 1;
        boolean flipCenter = colLen % 2 == 1;
        for (int r = 0; r < A.length; r++) {
            for (int c = 0; c < colLenHalf; c++) {
                int temp = A[r][c];
                A[r][c] = A[r][colLen - c - 1] == 0 ? 1 : 0;
                A[r][colLen - c - 1] = temp == 0 ? 1 : 0;
            }
            if (flipCenter)
                A[r][colLenHalf] = A[r][colLenHalf] == 0 ? 1 : 0;
        }
        return A;
    }

}