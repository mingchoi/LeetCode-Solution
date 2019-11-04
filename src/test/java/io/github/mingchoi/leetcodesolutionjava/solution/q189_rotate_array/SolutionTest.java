package io.github.mingchoi.leetcodesolutionjava.solution.q189_rotate_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate() {
        int[] ex;
        int[] temp;

        ex = new int[]{5, 6, 7, 1, 2, 3, 4};
        temp = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(temp, 3);
        for (int i = 0; i < temp.length; i++) {
            assertEquals(ex[i], temp[i]);
        }

        ex = new int[]{3, 99, -1, -100};
        temp = new int[]{-1, -100, 3, 99};
        new Solution().rotate(temp, 2);
        for (int i = 0; i < temp.length; i++) {
            assertEquals(ex[i], temp[i]);
        }

        ex = new int[]{1, 2};
        temp = new int[]{2, 1};
        new Solution().rotate(temp, 3);
        for (int i = 0; i < temp.length; i++) {
            assertEquals(ex[i], temp[i]);
        }
    }
}