package io.github.mingchoi.leetcodesolutionjava.solution.q204_count_primes;

import java.util.ArrayList;

/*
Runtime: 12 ms, faster than 70.90% of Java online submissions for Count Primes.
Memory Usage: 34.5 MB, less than 9.43% of Java online submissions for Count Primes.
 */

public class Solution {
    public int countPrimes(int n) {
        boolean[] flag = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (flag[i]) continue;
            count++;
            for (int j = i; j < n; j += i) flag[j] = true;
        }
        return count;
    }

    public int countPrimes_bruceforce(int n) {
        if (n < 2) return 0;

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            boolean notPrime = false;
            for (int p = 0; p < primes.size(); p++) {
                if (i % primes.get(p) == 0) {
                    notPrime = true;
                    break;
                }
            }
            if (!notPrime) primes.add(i);
        }

        return primes.size();
    }
}