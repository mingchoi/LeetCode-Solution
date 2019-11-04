package io.github.mingchoi.leetcodesolutionjava.solution.q55_jump_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canJump() {
        class TestCase {
            public boolean expected;
            public int[] nums;

            public TestCase(boolean ex, int[] nums) {
                this.expected = ex;
                this.nums = nums;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(false, new int[]{3, 2, 1, 0, 4}),
                new TestCase(true, new int[]{2, 3, 1, 1, 4}),
                new TestCase(true, new int[]{0}),
                new TestCase(false, new int[]{2,
                        0, 6, 9, 8, 4, 5, 0, 8, 9, 1, 2, 9, 6, 8, 8, 0,
                        6, 3, 1, 2, 2, 1, 2, 6, 5, 3, 1, 2, 2, 6, 4, 2,
                        4, 3, 0, 0, 0, 3, 8, 2, 4, 0, 1, 2, 0, 1, 4, 6,
                        5, 8, 0, 7, 9, 3, 4, 6, 6, 5, 8, 9, 3, 4, 3, 7,
                        0, 4, 9, 0, 9, 8, 4, 3, 0, 7, 7, 1, 9, 1, 9, 4,
                        9, 0, 1, 9, 5, 7, 7, 1, 5, 8, 2, 8, 2, 6, 8, 2,
                        2, 7, 5, 1, 7, 9, 6})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().canJump(c.nums));
        }
    }
}