package io.github.mingchoi.leetcodesolutionjava.solution.q22_generate_parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generateParenthesis() {
        class TestCase {
            public String[] expected;
            public int s;

            public TestCase(String[] ex, int s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"}, 3)
        };

        for (TestCase c : cases) {
            assertArrayEquals(c.expected, new Solution().generateParenthesis(c.s).toArray());
        }
    }
}