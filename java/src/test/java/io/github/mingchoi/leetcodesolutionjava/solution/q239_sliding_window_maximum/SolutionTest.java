package io.github.mingchoi.leetcodesolutionjava.solution.q239_sliding_window_maximum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxSlidingWindow() {
        assertArrayEquals(
                new int[]{3, 3, 5, 5, 6, 7},
                new Solution().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)
        );
        assertArrayEquals(
                new int[]{11},
                new Solution().maxSlidingWindow(new int[]{9, 11}, 2)
        );
    }
}