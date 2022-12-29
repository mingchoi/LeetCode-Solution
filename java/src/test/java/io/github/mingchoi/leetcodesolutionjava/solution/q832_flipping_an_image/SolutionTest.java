package io.github.mingchoi.leetcodesolutionjava.solution.q832_flipping_an_image;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void flipAndInvertImage() {
        int[][] ex = new int[][]{
                new int[]{1, 0, 0},
                new int[]{0, 1, 0},
                new int[]{1, 1, 1},
        };

        int[][] r = new Solution().flipAndInvertImage(new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 0, 1},
                new int[]{0, 0, 0},
        });
        for (int i = 0; i < ex.length; i++) {
            for (int n : r[i]) {
                System.out.print(n + ",");
            }
            System.out.println();
            assertArrayEquals(ex[i], r[i]);
        }
    }
}