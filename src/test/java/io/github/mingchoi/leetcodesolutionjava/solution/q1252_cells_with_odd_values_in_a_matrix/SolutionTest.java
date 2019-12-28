package io.github.mingchoi.leetcodesolutionjava.solution.q1252_cells_with_odd_values_in_a_matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void oddCells() {
        assertEquals(6,
                new Solution().oddCells(
                        2, 3,
                        new int[][]{
                                new int[]{0, 1},
                                new int[]{1, 1},
                        }));
    }
}