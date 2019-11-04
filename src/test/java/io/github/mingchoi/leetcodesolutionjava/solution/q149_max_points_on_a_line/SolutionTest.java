package io.github.mingchoi.leetcodesolutionjava.solution.q149_max_points_on_a_line;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxPoints() {

        class TestCase {
            public int expected;
            public int[][] args;

            public TestCase(int expected, int[][] args) {
                this.expected = expected;
                this.args = args;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(1, new int[][]{
                        new int[]{0, 0}
                }),
                new TestCase(3, new int[][]{
                        new int[]{1, 1},
                        new int[]{2, 2},
                        new int[]{3, 3}
                }),
                new TestCase(4, new int[][]{
                        new int[]{1, 1},
                        new int[]{3, 2},
                        new int[]{5, 3},
                        new int[]{4, 1},
                        new int[]{2, 3},
                        new int[]{1, 4}
                }),
                new TestCase(6, new int[][]{
                        new int[]{0, -12},
                        new int[]{5, 2},
                        new int[]{2, 5},
                        new int[]{0, -5},
                        new int[]{1, 5},
                        new int[]{2, -2},
                        new int[]{5, -4},
                        new int[]{3, 4},
                        new int[]{-2, 4},
                        new int[]{-1, 4},
                        new int[]{0, -5},
                        new int[]{0, -8},
                        new int[]{-2, -1},
                        new int[]{0, -11},
                        new int[]{0, -9},
                })
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().maxPoints(c.args));
        }
    }
}