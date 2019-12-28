package io.github.mingchoi.leetcodesolutionjava.solution.q300_longest_increasing_subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLIS() {
        assertEquals(4, new Solution().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(3, new Solution().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 4}));
    }
}