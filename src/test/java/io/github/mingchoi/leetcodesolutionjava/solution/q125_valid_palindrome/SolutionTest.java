package io.github.mingchoi.leetcodesolutionjava.solution.q125_valid_palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        class TestCase {
            public boolean expected;
            public String s;

            public TestCase(boolean ex, String s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(true, "A man, a plan, a canal: Panama"),
                new TestCase(false, "race a car"),
                new TestCase(true, ""),
                new TestCase(false, "0P"),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().isPalindrome(c.s));
        }
    }
}