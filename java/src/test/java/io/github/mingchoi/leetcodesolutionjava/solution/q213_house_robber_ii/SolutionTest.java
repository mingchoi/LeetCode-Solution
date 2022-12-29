package io.github.mingchoi.leetcodesolutionjava.solution.q213_house_robber_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rob() {
        assertEquals(3, new Solution().rob(new int[]{2, 3, 2}));
        assertEquals(4, new Solution().rob(new int[]{1, 2, 3, 1}));
        assertEquals(9, new Solution().rob(new int[]{1, 8, 3, 1}));
        assertEquals(11, new Solution().rob(new int[]{2, 7, 9, 3, 1}));
    }
}