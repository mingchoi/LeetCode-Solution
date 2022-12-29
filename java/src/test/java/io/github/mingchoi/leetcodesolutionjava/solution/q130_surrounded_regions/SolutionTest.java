package io.github.mingchoi.leetcodesolutionjava.solution.q130_surrounded_regions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solve() {
        class TestCase {
            public char[][] expected;
            public char[][] board;

            public TestCase(char[][] ex, char[][] board) {
                this.expected = ex;
                this.board = board;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        new char[][]{
                                new char[]{'X', 'X', 'X', 'X'},
                                new char[]{'X', 'X', 'X', 'X'},
                                new char[]{'X', 'O', 'X', 'X'},
                                new char[]{'X', 'O', 'X', 'X'},
                        },
                        new char[][]{
                                new char[]{'X', 'X', 'X', 'X'},
                                new char[]{'X', 'X', 'O', 'X'},
                                new char[]{'X', 'O', 'X', 'X'},
                                new char[]{'X', 'O', 'X', 'X'},
                        }),
        };

        for (TestCase c : cases) {
            new Solution().solve(c.board);
            for (int i = 0; i < c.expected.length; i++) {
                for (int j = 0; j < c.expected[0].length; j++) {
                    assertEquals(c.expected[i][j], c.board[i][j]);
                }
            }
        }
    }
}
