package io.github.mingchoi.leetcodesolutionjava.solution.q279_perfect_squares;

/*
Runtime: 15 ms, faster than 93.71% of Java online submissions for Perfect Squares.
Memory Usage: 35.4 MB, less than 18.05% of Java online submissions for Perfect Squares.
 */
public class Solution {
    public int numSquares(int n) {
        int maxBase = 1;
        while (maxBase * maxBase <= n) {
            maxBase++;
        }

        int[] list = new int[n];

        for (int i = 1; i < maxBase; i++) {
            int base = i * i;
            int index = base;
            int step = 1;
            while (index <= n) {
                list[index - 1] = step;
                index += base;
                step++;
            }
        }

        for (int i = maxBase - 1; i > 0; i--) {
            int base = i * i;
            for (int j = n - 1; j > base; j--) {
                if (list[j] > list[j - base] + 1) {
                    list[j] = list[j - base] + 1;
                }
            }

        }

        return list[n - 1];
    }
}
