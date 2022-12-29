package io.github.mingchoi.leetcodesolutionjava.solution.q162_find_peak_element;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findPeakElement() {
        assertEquals(2, new Solution().findPeakElement(new int[]{1, 2, 3, 1}));
        assertEquals(1, new Solution().findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}