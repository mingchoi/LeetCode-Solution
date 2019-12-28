package io.github.mingchoi.leetcodesolutionjava.solution.q240_search_a_2d_matrix_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchMatrix() {
        assertEquals(true,
                new Solution().searchMatrix(
                        new int[][]{
                                new int[]{1, 4, 7, 11, 15},
                                new int[]{2, 5, 8, 12, 19},
                                new int[]{3, 6, 9, 16, 22},
                                new int[]{10, 13, 14, 17, 24},
                                new int[]{18, 21, 23, 26, 30},
                        },
                        5
                )
        );

        assertEquals(false,
                new Solution().searchMatrix(
                        new int[][]{
                                new int[]{1, 4, 7, 11, 15},
                                new int[]{2, 5, 8, 12, 19},
                                new int[]{3, 6, 9, 16, 22},
                                new int[]{10, 13, 14, 17, 24},
                                new int[]{18, 21, 23, 26, 30},
                        },
                        20
                )
        );

        assertEquals(false,
                new Solution().searchMatrix(
                        new int[][]{
                                new int[]{-5},
                        },
                        -2
                )
        );

        assertEquals(true,
                new Solution().searchMatrix(
                        new int[][]{
                                new int[]{1, 2, 3, 4, 5},
                                new int[]{6, 7, 8, 9, 10},
                                new int[]{11, 12, 13, 14, 15},
                                new int[]{16, 17, 18, 19, 20},
                                new int[]{21, 22, 23, 24, 25},
                        },
                        19
                )
        );
    }
}