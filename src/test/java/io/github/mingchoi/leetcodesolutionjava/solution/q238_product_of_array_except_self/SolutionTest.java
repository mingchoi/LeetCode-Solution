package io.github.mingchoi.leetcodesolutionjava.solution.q238_product_of_array_except_self;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void productExceptSelf() {
        assertArrayEquals(
                new int[]{24, 12, 8, 6,},
                new Solution().productExceptSelf(new int[]{1, 2, 3, 4})
        );
    }
}