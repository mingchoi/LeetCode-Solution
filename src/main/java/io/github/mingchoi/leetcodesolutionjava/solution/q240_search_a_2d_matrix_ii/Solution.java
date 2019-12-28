package io.github.mingchoi.leetcodesolutionjava.solution.q240_search_a_2d_matrix_ii;

/*
Runtime: 5 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix II.
Memory Usage: 42.5 MB, less than 100.00% of Java online submissions for Search a 2D Matrix II.
 */

/*
 * Solution:
 *
 * Consider highight the range that might include the target in each row:
 * target = 13
 * [1,   4,  7,(11, 15)],
 * [2,   5,  8,(12, 19)],
 * [3,   6, (9, 16),22],
 * [10, (13,14),17, 24],
 * [18, 21, 23, 26, 30]
 *
 * The path will end up with a ladder like shape, so this is the basic
 * idea for this solution.
 * Three rules:
 * 1. if current is larger than target, go left
 * 2. if current is smaller than target, go down
 * 3. out of bound mean no suck value
 *
 */

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        if (rowLen == 0) return false;
        int colLen = matrix[0].length;
        if (colLen == 0) return false;
        int r = 0;
        int c = colLen - 1;

//        System.out.println("Find " + target);

        while (r < rowLen && c >= 0) {
//            System.out.print(r + ":" + c);
            int curr = matrix[r][c];
//            System.out.println("=" + curr);
            if (curr > target) {
                c--;
            } else if (curr < target) {
                r++;
            } else {
                return true;
            }
        }
        return false;
    }
}