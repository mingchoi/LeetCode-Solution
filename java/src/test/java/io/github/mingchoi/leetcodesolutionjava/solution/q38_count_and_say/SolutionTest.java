package io.github.mingchoi.leetcodesolutionjava.solution.q38_count_and_say;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countAndSay() {
        class TestCase {
            public String expected;
            public int s;

            public TestCase(String ex, int s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase("1", 1),
                new TestCase("11", 2),
                new TestCase("21", 3),
                new TestCase("1211", 4),
                new TestCase("111221", 5),
                new TestCase("11131221133112132113212221", 11),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().countAndSay(c.s));
        }
    }
}