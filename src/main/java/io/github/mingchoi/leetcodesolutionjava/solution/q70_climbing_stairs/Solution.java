package io.github.mingchoi.leetcodesolutionjava.solution.q70_climbing_stairs;

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int a = 1;
        int b = 2;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
