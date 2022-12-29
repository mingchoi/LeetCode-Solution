package io.github.mingchoi.leetcodesolutionjava.solution.q217_contains_duplicate;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void containsDuplicate() {
        assertEquals(true, new Solution().containsDuplicate(new int[]{1, 2, 3, 1}));
        assertEquals(false, new Solution().containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}