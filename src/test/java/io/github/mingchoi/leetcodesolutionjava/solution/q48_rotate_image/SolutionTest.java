package io.github.mingchoi.leetcodesolutionjava.solution.q48_rotate_image;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate() {
        class TestCase {
            public int[][] expected;
            public int[][] nums;

            public TestCase(int[][] ex, int[][] nums) {
                this.expected = ex;
                this.nums = nums;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(new int[][]{
                        {7, 4, 1},
                        {8, 5, 2},
                        {9, 6, 3}
                }, new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }),
                new TestCase(new int[][]{
                        {15, 13, 2, 5},
                        {14, 3, 4, 1},
                        {12, 6, 8, 9},
                        {16, 7, 10, 11}
                }, new int[][]{
                        {5, 1, 9, 11},
                        {2, 4, 8, 10},
                        {13, 3, 6, 7},
                        {15, 14, 12, 16}
                })
        };

        for (TestCase c : cases) {
            new Solution().rotate(c.nums);
            for (int i = 0; i < c.expected.length; i++) {
                assertArrayEquals(c.expected[i], c.nums[i]);
            }
        }
    }
}