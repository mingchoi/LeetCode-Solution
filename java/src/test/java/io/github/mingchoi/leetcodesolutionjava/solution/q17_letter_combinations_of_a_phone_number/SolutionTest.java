package io.github.mingchoi.leetcodesolutionjava.solution.q17_letter_combinations_of_a_phone_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void letterCombinations() {
        class TestCase {
            public String[] expected;
            public String s;

            public TestCase(String[] ex, String s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, "23"),
                new TestCase(new String[]{"a", "b", "c"}, "2"),
                new TestCase(new String[]{}, ""),

        };

        for (TestCase c : cases) {
            assertArrayEquals(c.expected, new Solution().letterCombinations(c.s).toArray());
        }
    }
}