package io.github.mingchoi.leetcodesolutionjava.solution.q4_median_of_two_sorted_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        class TestCase {
            public double expected;
            public int[] num1;
            public int[] num2;

            public TestCase(double ex, int[] num1, int[] num2) {
                this.expected = ex;
                this.num1 = num1;
                this.num2 = num2;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(2.0, new int[]{1, 3}, new int[]{2}),
                new TestCase(2.5, new int[]{1, 2}, new int[]{3, 4}),
                new TestCase(-1.0, new int[]{-2, -1}, new int[]{3})

        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().findMedianSortedArrays(c.num1, c.num2), 0.0);
        }
    }
}