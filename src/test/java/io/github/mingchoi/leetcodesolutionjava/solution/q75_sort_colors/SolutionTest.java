package io.github.mingchoi.leetcodesolutionjava.solution.q75_sort_colors;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortColors() {
        class TestCase {
            public int[] expected;
            public int[] num1;

            public TestCase(int[] ex, int[] num1) {
                this.expected = ex;
                this.num1 = num1;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(new int[]{0, 0, 1, 1, 2, 2}, new int[]{2, 0, 2, 1, 1, 0})
        };

        for (TestCase c : cases) {
            new Solution().sortColors(c.num1);
            assertArrayEquals(c.expected, c.num1);
        }
    }
}