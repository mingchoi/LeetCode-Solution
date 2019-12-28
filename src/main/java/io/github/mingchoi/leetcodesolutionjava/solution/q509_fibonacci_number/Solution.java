package io.github.mingchoi.leetcodesolutionjava.solution.q509_fibonacci_number;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
Memory Usage: 33.1 MB, less than 5.51% of Java online submissions for Fibonacci Number.
 */
public class Solution {
    public int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        int fm2 = 0;
        int fm1 = 1;
        for (int i = 1; i < N; i++) {
            int next = fm2 + fm1;
            fm2 = fm1;
            fm1 = next;
        }
        return fm1;
    }

    public int fib_recurive(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib_recurive(N - 1) + fib_recurive(N - 2);
    }
}