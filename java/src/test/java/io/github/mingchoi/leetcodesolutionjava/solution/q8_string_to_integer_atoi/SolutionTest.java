package io.github.mingchoi.leetcodesolutionjava.solution.q8_string_to_integer_atoi;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void myAtoi() {
        class TestCase {
            public int expected;
            public String s;

            public TestCase(int ex, String s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(123, "123"),
                new TestCase(-123, "-123"),
                new TestCase(456, "  456  "),
                new TestCase(123, "+123"),
                new TestCase(0, "word and 987"),
                new TestCase(-2147483648, "-91283472332"),
                new TestCase(0, " +0 123")
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().myAtoi(c.s));
        }
    }
}