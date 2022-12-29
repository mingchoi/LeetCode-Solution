package io.github.mingchoi.leetcodesolutionjava.solution.q334_increasing_triplet_subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void increasingTriplet() {
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertEquals(false,
                new Solution().increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{1, 4, 2, 5, 3}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{1, 5, 2, 3}));
        assertEquals(false,
                new Solution().increasingTriplet(new int[]{3, 2, 1, 5, 4}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{3, 2, 1, 4, 5}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{8, 2, 9, 5, 7, 6}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{1, 2, 3, 1, 2, 1}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{1, 0, -1, 0, 100}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{1, 2, -10, -8, -7}));
        assertEquals(false,
                new Solution().increasingTriplet(new int[]{1, 1, -2, 6}));
        assertEquals(true,
                new Solution().increasingTriplet(new int[]{1, 0, 10, 0, 100}));
    }
}