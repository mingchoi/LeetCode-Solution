package io.github.mingchoi.leetcodesolutionjava.solution.q821_shortest_distance_to_a_character;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shortestToChar() {
        assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
                new Solution().shortestToChar("loveleetcode", 'e'));
        assertArrayEquals(new int[]{2, 1, 0, 1},
                new Solution().shortestToChar("aaba", 'b'));
    }
}