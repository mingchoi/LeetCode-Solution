package io.github.mingchoi.leetcodesolutionjava.solution.q509_fibonacci_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fib() {
        assertEquals(1, new Solution().fib(1));
        assertEquals(1, new Solution().fib(2));
        assertEquals(2, new Solution().fib(3));
        assertEquals(3, new Solution().fib(4));
        assertEquals(5, new Solution().fib(5));
        assertEquals(8, new Solution().fib(6));
    }
}