package io.github.mingchoi.leetcodesolutionjava.solution.q215_kth_largest_element_in_an_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findKthLargest() {
        assertEquals(5, new Solution().findKthLargest(
                new int[]{3, 2, 1, 5, 6, 4}
                , 2
        ));
        assertEquals(4, new Solution().findKthLargest(
                new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}
                , 4
        ));
    }
}