package io.github.mingchoi.leetcodesolutionjava.solution.q76_minimum_window_substring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minWindow() {
        class TestCase {
            public String expected;
            public String s1;
            public String s2;

            public TestCase(String ex, String s1, String s2) {
                this.expected = ex;
                this.s1 = s1;
                this.s2 = s2;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase("BANC", "ADOBECODEBANC", "ABC"),
                new TestCase("BANC", "EADOBECODEBANC", "ABC"),
//                new TestCase("", "A", "B"),
//                new TestCase("A", "A", "A"),
//                new TestCase("", "ab", "A"),
//                new TestCase("a", "ab", "a")
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().minWindow(c.s1, c.s2));
        }
    }
}