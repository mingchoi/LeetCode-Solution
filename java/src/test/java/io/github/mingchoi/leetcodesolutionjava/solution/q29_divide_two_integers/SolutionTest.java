package io.github.mingchoi.leetcodesolutionjava.solution.q29_divide_two_integers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void divide() {
        class TestCase {
            public int expected;
            public int s1;
            public int s2;

            public TestCase(int ex, int s1, int s2) {
                this.expected = ex;
                this.s1 = s1;
                this.s2 = s2;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(3, 10, 3),
                new TestCase(3, 9, 3),
                new TestCase(-2, 7, -3),
                new TestCase(1, 1, 1),
                new TestCase(1, 2147483647, 2147483647),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().divide(c.s1, c.s2));
        }
    }
}