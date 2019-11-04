package io.github.mingchoi.leetcodesolutionjava.solution.q204_count_primes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countPrimes() {
        assertEquals(4, new Solution().countPrimes(10));
        assertEquals(8, new Solution().countPrimes(20));
//        assertEquals(8, new Solution().countPrimes(499979));
    }
}