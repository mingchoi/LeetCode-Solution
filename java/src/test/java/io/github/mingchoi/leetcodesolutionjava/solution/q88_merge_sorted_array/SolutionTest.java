package io.github.mingchoi.leetcodesolutionjava.solution.q88_merge_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void merge() {
        class TestCase {
            public int[] expected;
            public int[] num1;
            public int m;
            public int[] num2;
            public int n;

            public TestCase(int[] ex, int[] num1, int m, int[] num2, int n) {
                this.expected = ex;
                this.num1 = num1;
                this.m = m;
                this.num2 = num2;
                this.n = n;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{4, 5, 6}, 3),
                new TestCase(new int[]{1, 2, 3, 4, 5, 6}, new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3),
                new TestCase(new int[]{1, 2, 2, 3, 5, 6}, new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3),
        };

        for (TestCase c : cases) {
            new Solution().merge(c.num1, c.m, c.num2, c.n);
            assertArrayEquals(c.expected, c.num1);
        }
    }
}