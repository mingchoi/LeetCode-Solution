package io.github.mingchoi.leetcodesolutionjava.solution.q41_first_missing_positive;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void firstMissingPositive() {
        class TestCase {
            public int expected;
            public int[] s;

            public TestCase(int ex, int[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(3, new int[]{1, 2, 0}),
                new TestCase(2, new int[]{3, 4, -1, 1}),
                new TestCase(1, new int[]{7, 8, 9, 11, 12}),
                new TestCase(4, new int[]{1, 2, 3}),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().firstMissingPositive(c.s));
        }
    }
}