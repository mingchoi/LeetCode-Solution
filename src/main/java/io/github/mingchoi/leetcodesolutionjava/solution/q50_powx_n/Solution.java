package io.github.mingchoi.leetcodesolutionjava.solution.q50_powx_n;

class Solution {
    public double myPow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1.00000;
        }

        if (x == -1) {
            if (n % 2 == 0) {
                return 1.00000;
            } else {
                return -1.00000;
            }

        }

        if (n < -1000) {
            return 0;
        }

        double r = x;
        for (int i = 1; i < n; i++) {
            r *= x;
        }
        return r;
    }
}
