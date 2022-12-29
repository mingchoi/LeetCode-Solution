package io.github.mingchoi.leetcodesolutionjava.solution.q347_top_k_frequent_elements;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void topKFrequent() {

        assertEquals(
                Arrays.asList(1, 2),
                new Solution().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)
        );

        assertEquals(
                Arrays.asList(1),
                new Solution().topKFrequent(new int[]{1}, 1)
        );

    }
}