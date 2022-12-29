package io.github.mingchoi.leetcodesolutionjava.solution.q20_valid_parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValid() {
        class TestCase {
            public boolean expected;
            public String s;

            public TestCase(boolean ex, String s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(true, "()"),
                new TestCase(true, "()[]{}"),
                new TestCase(false, "(]"),
                new TestCase(false, "([)]"),
                new TestCase(true, "{()}")
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().isValid(c.s));
        }
    }
}