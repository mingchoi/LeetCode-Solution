package io.github.mingchoi.leetcodesolutionjava.solution.q921_minimum_add_to_make_parentheses_valid;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minAddToMakeValid() {
        assertEquals(1, new Solution().minAddToMakeValid("())"));
        assertEquals(3, new Solution().minAddToMakeValid("((("));
        assertEquals(0, new Solution().minAddToMakeValid("()"));
        assertEquals(4, new Solution().minAddToMakeValid("()))(("));
    }
}