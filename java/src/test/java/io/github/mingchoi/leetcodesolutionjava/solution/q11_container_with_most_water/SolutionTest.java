package io.github.mingchoi.leetcodesolutionjava.solution.q11_container_with_most_water;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {
        class TestCase {
            public int expected;
            public int[] a;

            public TestCase(int ex, int[] a) {
                this.expected = ex;
                this.a = a;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(49, new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().maxArea(c.a));
        }
    }
}