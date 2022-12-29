package io.github.mingchoi.leetcodesolutionjava.solution.q198_house_robber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rob() {
        assertEquals(2, new Solution().rob(new int[]{1, 2}));
        assertEquals(2, new Solution().rob(new int[]{2, 1}));
        assertEquals(4, new Solution().rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, new Solution().rob(new int[]{2, 7, 9, 3, 1}));
    }
}