package io.github.mingchoi.leetcodesolutionjava.solution.q7_reverse_integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        class TestCase {
            public long expected;
            public long s;

            public TestCase(long ex, long s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(123, 321),
                new TestCase(-123, -321),
                new TestCase(9646324351L, 1534236469L)
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().reverse(c.s));
        }
    }
}