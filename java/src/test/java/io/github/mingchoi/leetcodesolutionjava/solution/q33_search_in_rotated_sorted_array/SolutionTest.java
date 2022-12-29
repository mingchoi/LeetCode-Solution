package io.github.mingchoi.leetcodesolutionjava.solution.q33_search_in_rotated_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void search() {
        class TestCase {
            public int expected;
            public int[] nums;
            public int target;

            public TestCase(int ex, int[] nums, int target) {
                this.expected = ex;
                this.nums = nums;
                this.target = target;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(4, new int[]{4, 5, 6, 7, 0, 1, 2}, 0),
                new TestCase(-1, new int[]{4, 5, 6, 7, 0, 1, 2}, 3)
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().search(c.nums, c.target));
        }
    }
}