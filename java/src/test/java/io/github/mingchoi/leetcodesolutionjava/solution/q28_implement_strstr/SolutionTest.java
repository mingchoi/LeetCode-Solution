package io.github.mingchoi.leetcodesolutionjava.solution.q28_implement_strstr;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void strStr() {
        class TestCase {
            public int expected;
            public String s1;
            public String s2;

            public TestCase(int ex, String s1, String s2) {
                this.expected = ex;
                this.s1 = s1;
                this.s2 = s2;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(2, "hello", "ll"),
                new TestCase(-1, "aaaaa", "ba"),
                new TestCase(0, "", ""),
                new TestCase(0, "aaa", "a")
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().strStr(c.s1, c.s2));
        }
    }
}