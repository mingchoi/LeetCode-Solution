package io.github.mingchoi.leetcodesolutionjava.solution.q289_game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void gameOfLife() {
        int[][] input;
        int[][] ex;
        input = new int[][]{
                new int[]{0, 1, 0},
                new int[]{0, 0, 1},
                new int[]{1, 1, 1},
                new int[]{0, 0, 0}
        };
        ex = new int[][]{
                new int[]{0, 0, 0},
                new int[]{1, 0, 1},
                new int[]{0, 1, 1},
                new int[]{0, 1, 0}
        };
        new Solution().gameOfLife(input);
        for (int r = 0; r < input.length; r++) {
            assertArrayEquals(ex[r], input[r]);
        }
    }
}