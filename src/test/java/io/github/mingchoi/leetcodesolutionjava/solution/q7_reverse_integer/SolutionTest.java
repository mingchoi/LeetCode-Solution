package io.github.mingchoi.leetcodesolutionjava.solution.q7_reverse_integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        class TestCase {
            public int expected;
            public int s;

            public TestCase(int ex, int s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(123, 321),
                new TestCase(-123, -321)
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().reverse(c.s));
        }
    }
}