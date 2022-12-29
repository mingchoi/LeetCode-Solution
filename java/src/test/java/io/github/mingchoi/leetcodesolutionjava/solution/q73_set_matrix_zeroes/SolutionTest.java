package io.github.mingchoi.leetcodesolutionjava.solution.q73_set_matrix_zeroes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void setZeroes() {
        class TestCase {
            public int[][] expected;
            public int[][] s;

            public TestCase(int[][] ex, int[][] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(new int[][]{
                        {1, 0, 1},
                        {0, 0, 0},
                        {1, 0, 1}
                }, new int[][]{
                        {1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1}
                }),
                new TestCase(new int[][]{
                        {0, 0, 0, 0},
                        {0, 4, 5, 0},
                        {0, 3, 1, 0}
                }, new int[][]{
                        {0, 1, 2, 0},
                        {3, 4, 5, 2},
                        {1, 3, 1, 5}
                })
        };

        for (TestCase c : cases) {
            new Solution().setZeroes(c.s);
            for (int i = 0; i < c.expected.length; i++) {
                assertArrayEquals(c.expected[i], c.s[i]);
            }
        }
    }
}