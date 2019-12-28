package io.github.mingchoi.leetcodesolutionjava.solution.q1047_remove_all_adjacent_duplicates_in_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        assertEquals("ca", new Solution().removeDuplicates("abbaca"));
        assertEquals("", new Solution().removeDuplicates("aaaaaaaa"));
        assertEquals("ba", new Solution().removeDuplicates("bcca"));
    }
}