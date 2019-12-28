package io.github.mingchoi.leetcodesolutionjava.solution.q120_triangle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minimumTotal() {
        assertEquals(11, new Solution().minimumTotal(
                Arrays.asList(
                        Arrays.asList(2),
                        Arrays.asList(3, 4),
                        Arrays.asList(6, 5, 7),
                        Arrays.asList(4, 1, 8, 3)
                )
        ));
    }
}