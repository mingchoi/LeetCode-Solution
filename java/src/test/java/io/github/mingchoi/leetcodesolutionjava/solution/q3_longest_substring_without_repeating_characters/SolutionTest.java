package io.github.mingchoi.leetcodesolutionjava.solution.q3_longest_substring_without_repeating_characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        class TestCase {
            public int expected;
            public String s;

            public TestCase(int ex, String s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(3, "abc"),
                new TestCase(4, "abcabcdabca"),
                new TestCase(3, "abcabcbb"),
                new TestCase(1, "a"),
                new TestCase(3, "abcabccc"),
                new TestCase(0, "")
        };

        for (TestCase c : cases) {
            assertEquals(new Solution().lengthOfLongestSubstring(c.s), c.expected);
        }
    }
}