package io.github.mingchoi.leetcodesolutionjava.solution.q371_sum_of_two_integers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getSum() {
        assertEquals(3, new Solution().getSum(1, 2));
        assertEquals(1, new Solution().getSum(-2, 3));
    }
}