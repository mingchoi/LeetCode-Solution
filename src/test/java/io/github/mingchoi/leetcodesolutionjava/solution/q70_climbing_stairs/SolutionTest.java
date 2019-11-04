package io.github.mingchoi.leetcodesolutionjava.solution.q70_climbing_stairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void climbStairs() {
        class TestCase {
            public int expected;
            public int s;

            public TestCase(int ex, int s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(1, 1),
                new TestCase(2, 2),
                new TestCase(3, 3),
                new TestCase(5, 4),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().climbStairs(c.s));
        }
    }
}