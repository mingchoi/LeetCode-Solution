package io.github.mingchoi.leetcodesolutionjava.solution.q454_4sum_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fourSumCount() {
        assertEquals(2,
                new Solution().fourSumCount(
                        new int[]{1, 2},
                        new int[]{-2, -1},
                        new int[]{-1, 2},
                        new int[]{0, 2}
                )
        );
        assertEquals(6,
                new Solution().fourSumCount(
                        new int[]{-1, -1},
                        new int[]{-1, 1},
                        new int[]{-1, 1},
                        new int[]{1, -1}
                )
        );
    }
}