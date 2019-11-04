package io.github.mingchoi.leetcodesolutionjava.solution.q169_majority_element;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void majorityElement() {
        assertEquals(3, new Solution().majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, new Solution().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(3, new Solution().majorityElement(new int[]{3, 3, 4}));
    }
}