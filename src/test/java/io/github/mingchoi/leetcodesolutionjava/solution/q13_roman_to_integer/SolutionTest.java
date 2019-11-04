package io.github.mingchoi.leetcodesolutionjava.solution.q13_roman_to_integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        class TestCase {
            public int expected;
            public String s;

            public TestCase(int ex, String s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(1994, "MCMXCIV"),
                new TestCase(999, "CMXCIX"),
                new TestCase(444, "CDXLIV")
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().romanToInt(c.s));
        }
    }
}