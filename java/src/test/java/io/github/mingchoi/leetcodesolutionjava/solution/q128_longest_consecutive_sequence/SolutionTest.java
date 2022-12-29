package io.github.mingchoi.leetcodesolutionjava.solution.q128_longest_consecutive_sequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestConsecutive() {
        class TestCase {
            public int expected;
            public int[] s;

            public TestCase(int ex, int[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
//                new TestCase(4, new int[]{100, 4, 200, 1, 3, 2}),
//                new TestCase(5, new int[]{1, 3, 5, 2, 4}),
//                new TestCase(4, new int[]{-7, -1, 3, -9, -4, 7, -3, 2, 4, 9, 4, -9, 8, -7, 5, -1, -7})
                new TestCase(4, new int[]{3, 2, 4, 5, -1, -7})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().longestConsecutive(c.s));
        }
    }
}