package io.github.mingchoi.leetcodesolutionjava.solution.q350_intersection_of_two_arrays_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intersect() {
        assertArrayEquals(new int[]{2, 2},
                new Solution().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})
        );
        assertArrayEquals(new int[]{4, 9},
                new Solution().intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})
        );
    }
}