package io.github.mingchoi.leetcodesolutionjava.solution.q91_decode_ways;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numDecodings() {
        class TestCase {
            public int expected;
            public String s;

            public TestCase(int ex, String s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(2, "12"),
                new TestCase(3, "226"),
                new TestCase(5, "2226"),
                new TestCase(0, "0"),
                new TestCase(0, "012"),
//                new TestCase(5, "2206"),
                new TestCase(1, "27"),
                new TestCase(1, "789"),
                new TestCase(2, "227"),
//                new TestCase(2, "722"),
        };

        for (TestCase c : cases) {
            System.out.println("Case: " + c.s);
            assertEquals(c.expected, new Solution().numDecodings(c.s));
        }
    }
}