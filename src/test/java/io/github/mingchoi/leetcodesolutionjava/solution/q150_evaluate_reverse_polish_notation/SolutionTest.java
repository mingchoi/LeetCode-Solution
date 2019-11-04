package io.github.mingchoi.leetcodesolutionjava.solution.q150_evaluate_reverse_polish_notation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void evalRPN() {

        class TestCase {
            public int expected;
            public String[] args;

            public TestCase(Integer expected, String[] args) {
                this.expected = expected;
                this.args = args;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(3, new String[]{
                        "2", "1", "+"
                }),
                new TestCase(9, new String[]{
                        "2", "1", "+", "3", "*"
                }),
                new TestCase(6, new String[]{
                        "4", "13", "5", "/", "+"
                }),
                new TestCase(22, new String[]{
                        "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"
                }),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().evalRPN(c.args));
        }
    }
}