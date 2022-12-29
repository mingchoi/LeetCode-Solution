package io.github.mingchoi.leetcodesolutionjava.solution.q329_longest_increasing_path_in_a_matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestIncreasingPath() {
        /*
        assertEquals(
                4,
                new Solution().longestIncreasingPath(new int[][]{
                        new int[]{9, 9},
                        new int[]{6, 6},
                        new int[]{2, 1},
                })
        );

        assertEquals(
                4,
                new Solution().longestIncreasingPath(new int[][]{
                        new int[]{9, 9, 4},
                        new int[]{6, 6, 8},
                        new int[]{2, 1, 1},
                })
        );
         */

        assertEquals(
                3,
                new Solution().longestIncreasingPath(new int[][]{
                        new int[]{0},
                        new int[]{1},
                        new int[]{5},
                        new int[]{5},
                })
        );
    }
}