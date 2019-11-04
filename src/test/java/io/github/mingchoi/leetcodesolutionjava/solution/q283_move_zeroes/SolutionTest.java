package io.github.mingchoi.leetcodesolutionjava.solution.q283_move_zeroes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void moveZeroes() {
        int[] ex;
        int[] input;
        input = new int[]{0, 1, 0, 3, 12};
        ex = new int[]{1, 3, 12, 0, 0};
        new Solution().moveZeroes(input);
        assertArrayEquals(ex, input);
    }
}