package io.github.mingchoi.leetcodesolutionjava.solution.q179_largest_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestNumber() {
        assertEquals("210", new Solution().largestNumber(new int[]{10, 2}));
        assertEquals("9534330", new Solution().largestNumber(new int[]{3, 30, 34, 5, 9}));
        assertEquals("12812", new Solution().largestNumber(new int[]{128, 12}));
        assertEquals("0", new Solution().largestNumber(new int[]{0, 0}));
        assertEquals("9609938824824769735703560743981399", new Solution().largestNumber(new int[]{824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247}));
    }
}