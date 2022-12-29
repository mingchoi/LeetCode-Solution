package io.github.mingchoi.leetcodesolutionjava.solution.q34_find_first_and_last_position_of_element_in_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchRange() {
        class TestCase {
            public int[] expected;
            public int[] nums;
            public int target;

            public TestCase(int[] ex, int[] nums, int target) {
                this.expected = ex;
                this.nums = nums;
                this.target = target;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(new int[]{3, 4}, new int[]{5, 7, 7, 8, 8, 10}, 8),
                new TestCase(new int[]{-1, -1}, new int[]{5, 7, 7, 8, 8, 10}, 6),
        };

        for (TestCase c : cases) {
            assertArrayEquals(c.expected, new Solution().searchRange(c.nums, c.target));
        }
    }
}