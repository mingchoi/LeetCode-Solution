package io.github.mingchoi.leetcodesolutionjava.solution.q166_fraction_to_recurring_decimal;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fractionToDecimal() {
        assertEquals("0.5", new Solution().fractionToDecimal(1, 2));
        assertEquals("2", new Solution().fractionToDecimal(2, 1));
        assertEquals("0.(6)", new Solution().fractionToDecimal(2, 3));
    }
}