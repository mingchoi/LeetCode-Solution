package io.github.mingchoi.leetcodesolutionjava.solution.q69_sqrtx;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void mySqrt() {
        class TestCase {
            public int expected;
            public int s;

            public TestCase(int ex, int s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(2, 4),
                new TestCase(2, 8),
                new TestCase(1, 1),
                new TestCase(0, 0),
                new TestCase(10000, 100000000),
                new TestCase(46340, 2147483647),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().mySqrt(c.s));
        }
    }
}