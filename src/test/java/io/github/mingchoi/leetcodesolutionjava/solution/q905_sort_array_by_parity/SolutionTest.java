package io.github.mingchoi.leetcodesolutionjava.solution.q905_sort_array_by_parity;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortArrayByParity() {
        int[] r = new Solution().sortArrayByParity(
                new int[]{4, 3, 1, 2, 6, 5}
        );

        assertArrayEquals(
                new int[]{4, 2, 6, 5, 1, 3},
                r

        );
    }
}