package io.github.mingchoi.leetcodesolutionjava.solution.q26_remove_duplicates_from_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        class TestCase {
            public int expected;
            public int[] expected2;
            public int[] nums;

            public TestCase(int ex, int[] ex2, int[] nums) {
                this.expected = ex;
                this.expected2 = ex2;
                this.nums = nums;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(2, new int[]{1, 2, 2}, new int[]{1, 1, 2}),
                new TestCase(5, new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4}, new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().removeDuplicates(c.nums));
            assertArrayEquals(c.expected2, c.nums);
        }
    }
}