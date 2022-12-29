package io.github.mingchoi.leetcodesolutionjava.solution.q326_power_of_three;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPowerOfThree() {
        assertEquals(true, new Solution().isPowerOfThree(27));
        assertEquals(false, new Solution().isPowerOfThree(0));
        assertEquals(true, new Solution().isPowerOfThree(9));
        assertEquals(false, new Solution().isPowerOfThree(45));
        assertEquals(true, new Solution().isPowerOfThree(1));
    }
}