package io.github.mingchoi.leetcodesolutionjava.solution.q62_unique_paths;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
Memory Usage: 32.9 MB, less than 5.10% of Java online submissions for Unique Paths.
 */
class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePaths_dp1dtable(m, n);
    }

    private int uniquePaths_dp2dtable(int m, int n) {
        int[][] t = new int[m][n];
        for (int x = 0; x < m; x++) {
            t[x][0] = 1;
        }

        for (int y = 0; y < n; y++) {
            t[0][y] = 1;
        }

        for (int x = 1; x < m; x++) {
            for (int y = 1; y < n; y++) {
                t[x][y] = t[x - 1][y] + t[x][y - 1];
            }
        }
        return t[m - 1][n - 1];
    }

    private int uniquePaths_dp1dtable(int m, int n) {
        int[] t = new int[m];
        for (int x = 0; x < m; x++) {
            t[x] = 1;
        }

        for (int y = 1; y < n; y++) {
            for (int x = 1; x < m; x++) {
                t[x] += t[x - 1];
            }
        }
        return t[m - 1];
    }
}
