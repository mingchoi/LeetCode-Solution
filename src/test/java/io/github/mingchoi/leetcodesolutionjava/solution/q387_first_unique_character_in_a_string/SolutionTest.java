package io.github.mingchoi.leetcodesolutionjava.solution.q387_first_unique_character_in_a_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void firstUniqChar() {
        assertEquals(0, new Solution().firstUniqChar("leetcode"));
        assertEquals(2, new Solution().firstUniqChar("loveleetcode"));
    }
}