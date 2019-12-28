package io.github.mingchoi.leetcodesolutionjava.solution.q315_count_of_smaller_numbers_after_self;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countSmaller() {
        assertEquals(
                Arrays.asList(2, 1, 1, 0),
                new Solution().countSmaller(new int[]{5, 2, 6, 1})
        );
    }
}