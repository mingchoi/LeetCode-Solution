package io.github.mingchoi.leetcodesolutionjava.solution.q79_word_search;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void exist() {
        class TestCase {
            public boolean expected;
            public char[][] b;
            public String s;

            public TestCase(boolean ex, char[][] b, String s) {
                this.expected = ex;
                this.b = b;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(true, new char[][]{
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                }, "ABCCED"),
                new TestCase(true, new char[][]{
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                }, "SEE"),
                new TestCase(false, new char[][]{
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                }, "ABCB")
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().exist(c.b, c.s));
        }
    }
}