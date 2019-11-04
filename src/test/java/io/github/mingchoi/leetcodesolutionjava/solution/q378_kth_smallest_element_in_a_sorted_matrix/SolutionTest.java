package io.github.mingchoi.leetcodesolutionjava.solution.q378_kth_smallest_element_in_a_sorted_matrix;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void kthSmallest() {
        assertEquals(13,
                new Solution().kthSmallest(
                        new int[][]{
                                new int[]{1, 5, 9},
                                new int[]{10, 11, 13},
                                new int[]{12, 13, 15}
                        },
                        8)
        );
    }
}