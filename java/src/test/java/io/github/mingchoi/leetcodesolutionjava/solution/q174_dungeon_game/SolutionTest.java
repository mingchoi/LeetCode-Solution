package io.github.mingchoi.leetcodesolutionjava.solution.q174_dungeon_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void calculateMinimumHP() {
        int ex;
        int[][] args;

        ex = 7;
        args = new int[][]{
                new int[]{-2, -3, 3},
                new int[]{-5, -10, 1},
                new int[]{10, 30, -5}
        };
        assertEquals(ex, new Solution().calculateMinimumHP(args));

        ex = 1;
        args = new int[][]{
                new int[]{100}
        };
        assertEquals(ex, new Solution().calculateMinimumHP(args));

        ex = 4;
        args = new int[][]{
                new int[]{0, -3}
        };
        assertEquals(ex, new Solution().calculateMinimumHP(args));

        ex = 3;
        args = new int[][]{
                new int[]{1, -3, 3},
                new int[]{0, -2, 0},
                new int[]{-3, -3, -3}
        };
        assertEquals(ex, new Solution().calculateMinimumHP(args));
    }
}