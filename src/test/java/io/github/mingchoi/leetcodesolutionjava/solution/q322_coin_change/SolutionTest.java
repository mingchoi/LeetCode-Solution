package io.github.mingchoi.leetcodesolutionjava.solution.q322_coin_change;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void coinChange() {

        assertEquals(3,
                new Solution().coinChange(new int[]{1, 2, 5}, 11)
        );

        assertEquals(3,
                new Solution().coinChange(new int[]{2, 3, 5}, 11)
        );

        assertEquals(4,
                new Solution().coinChange(new int[]{2, 5, 9}, 28)
        );

        assertEquals(0,
                new Solution().coinChange(new int[]{1}, 0)
        );

        assertEquals(2,
                new Solution().coinChange(new int[]{1, 2147483647}, 2)
        );

        assertEquals(4,
                new Solution().coinChange(new int[]{1, 2, 5, 10}, 18)
        );

        assertEquals(2,
                new Solution().coinChange(new int[]{1, 2, 5}, 10)
        );

        assertEquals(3,
                new Solution().coinChange(new int[]{1, 2, 5}, 11)
        );

        assertEquals(4,
                new Solution().coinChange(new int[]{2, 5, 10, 1}, 27)
        );

        assertEquals(20,
                new Solution().coinChange(new int[]{186, 419, 83, 408}, 6249)
        );
    }
}