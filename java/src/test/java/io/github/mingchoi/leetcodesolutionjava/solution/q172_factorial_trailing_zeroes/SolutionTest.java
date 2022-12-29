package io.github.mingchoi.leetcodesolutionjava.solution.q172_factorial_trailing_zeroes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void trailingZeroes() {
        assertEquals(0, new Solution().trailingZeroes(3));
        assertEquals(1, new Solution().trailingZeroes(5));
        assertEquals(1, new Solution().trailingZeroes(9));
        assertEquals(2, new Solution().trailingZeroes(10));
        assertEquals(4, new Solution().trailingZeroes(21));
        assertEquals(4, new Solution().trailingZeroes(24));
        assertEquals(6, new Solution().trailingZeroes(25));
        assertEquals(6, new Solution().trailingZeroes(29));
        assertEquals(7, new Solution().trailingZeroes(30));
        assertEquals(10, new Solution().trailingZeroes(49));
        assertEquals(12, new Solution().trailingZeroes(50));
    }
}