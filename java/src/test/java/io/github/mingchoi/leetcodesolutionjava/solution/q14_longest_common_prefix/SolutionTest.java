package io.github.mingchoi.leetcodesolutionjava.solution.q14_longest_common_prefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        class TestCase {
            public String expected;
            public String[] s;

            public TestCase(String ex, String[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase("fl", new String[]{"flower", "flow", "flight"}),
                new TestCase("", new String[]{"dog", "racecar", "car"}),
                new TestCase("abc", new String[]{"abc", "abc"}),
                new TestCase("ab", new String[]{"abc", "abd"}),
                new TestCase("abcd", new String[]{"abcd", "abcdefg"}),
                new TestCase("", new String[]{}),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().longestCommonPrefix(c.s));
        }
    }
}