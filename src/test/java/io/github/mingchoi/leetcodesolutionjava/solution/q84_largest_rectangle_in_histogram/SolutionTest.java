package io.github.mingchoi.leetcodesolutionjava.solution.q84_largest_rectangle_in_histogram;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestRectangleArea() {
        class TestCase {
            public int expected;
            public int[] arr;

            public TestCase(int ex, int[] arr) {
                this.expected = ex;
                this.arr = arr;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(10, new int[]{2, 1, 5, 6, 2, 3}),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().largestRectangleArea(c.arr));
        }
    }
}