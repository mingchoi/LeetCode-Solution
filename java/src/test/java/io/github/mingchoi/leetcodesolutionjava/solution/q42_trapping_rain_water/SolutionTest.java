package io.github.mingchoi.leetcodesolutionjava.solution.q42_trapping_rain_water;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void trap() {
        class TestCase {
            public int expected;
            public int[] s;

            public TestCase(int ex, int[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(4, new int[]{0, 0, 0, 1, 0, 0, 0, 2, 1, 0, 1, 0}),
                new TestCase(6, new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().trap(c.s));
        }
    }
}